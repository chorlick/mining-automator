/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  chorl_000
 * Created: Feb 11, 2018
 */

create table `user`(
    id uuid,
    email varchar_ignorecase(50) not null,
    username varchar_ignorecase(50) not null primary key,
    password varchar_ignorecase(128) not null,   
    enabled boolean not null
);

create table mining_installations (
    id uuid not null primary key,
    name varchar(50),
    description varchar(50), 
    user_id uuid,
    foreign key (user_id) references `user`(id)
);

create table mining_rigs (
    id uuid not null primary key,
    name varchar(50),
    description varchar(50),
    mining_installation_id uuid,
    foreign key (mining_installation_id) references mining_installations(id)
);

create table rig_heart_beats (
    id uuid not null primary key,
    beat timestamp, 
    mining_rig_id uuid,
    foreign key (mining_rig_id) references mining_rigs(id)
);

create table pending_registration (
    id uuid not null primary key,
    user_id uuid,
    foreign key (user_id) references `user`(id)
);


