create table if not exists block_transfer_request_headers(
request_date varchar(255) not null,
server varchar(255) null,
x_frame_options varchar(255) null,
same_origin varchar(255) null,
strict_transport_security varchar(255) null,
content_type_options varchar(255) null,
xss_protection varchar(255) null,
cache_control varchar(255) null,
pragma varchar(255) null,
expires varchar(255) null,
constraint block_transfer_request_headers_pk primary key(request_date));