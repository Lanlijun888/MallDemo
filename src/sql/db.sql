-- 银行表
create table bank
(
    id           bigint auto_increment comment '编号'
        primary key,
    cardNumber   varchar(512)                        not null comment '银行卡号',
    userAccount  varchar(512)                        not null comment '账户名',
    cardPassword varchar(1024)                       not null comment '银行卡密码',
    balance      double    default 0                 null comment '金额',
    createTime   timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '银行卡信息变更时间',
    isDelete     int       default 0                 not null comment '0-存在，1-删除'
)
    comment '银行卡';


-- 订单表
create table orders
(
    id        varchar(512)                        not null comment '订单号'
        primary key,
    consumer  varchar(512)                        not null comment '消费者',
    balance   double                              not null comment '消费金额',
    orderType int                                 not null comment '0-消费，1-退款',
    orderTime timestamp default CURRENT_TIMESTAMP not null comment '订单时间',
    isDelete  int       default 0                 not null comment '0-存在，1-删除'
)
    comment '订单表';

-- 金额变动记录表
create table records
(
    id       bigint auto_increment comment '编号'
        primary key,
    userName varchar(512)                        not null comment '用户名',
    type     int                                 not null comment '0-支出，1-收入',
    balance  double                              not null comment '金额',
    time     timestamp default CURRENT_TIMESTAMP not null comment '记录时间',
    isDelete int       default 0                 not null comment '0-存在，1-删除'
)
    comment '金额变动记录表';

-- 钱包表
create table wallet
(
    id          bigint auto_increment comment '编号'
        primary key,
    userName    varchar(256)                        not null comment '用户名',
    payPassword varchar(512)                        not null comment '支付密码',
    balance     double                              not null comment '余额',
    createTime  timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime  timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '钱包余额更新时间',
    isDelete    int       default 0                 not null comment '0-存在，1-删除',
    constraint balance
        check (`balance` >= 0)
)
    comment '钱包';
