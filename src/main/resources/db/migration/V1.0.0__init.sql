create table users
(
    id                      bigint        not null,
    updated_at              timestamp     not null,
    created_at              timestamp     not null,
    updated_by              bigint        not null,
    created_by              bigint        not null,
    enabled                 bool          default true,
    full_name               varchar(30)   not null,
    username                varchar(30)   not null,
    password                varchar(1000) not null,
    mobile                  varchar(20),
    email                   varchar(50),
    constraint users_pk primary key (id),
    constraint users_username_uk unique (username)
);