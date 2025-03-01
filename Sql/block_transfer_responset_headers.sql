create table if not exists block_transfer_responset_headers(
response_time Integer not null,
response_size Integer null,
socket_initialization varchar(255) null,
dns_lookup varchar(255) null,
tcp_handshake varchar(255) null,
ssl_handshake varchar(255) null,
transfer_start varchar(255) null,
content_type varchar(255) null,
content_length varchar(255) null,
connection_string varchar(255) null,
default_src varchar(255) null,
unsafe_inline varchar(255) null,
response_header varchar(255) null,
unsafe_eval varchar(255) null,
constraint block_transfer_responset_headers_pk primary key(response_time));