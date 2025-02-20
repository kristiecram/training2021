PGDMP     !                     x            ceva    11.3    11.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            	           1262    16900    ceva    DATABASE     �   CREATE DATABASE ceva WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_Philippines.1252' LC_CTYPE = 'English_Philippines.1252';
    DROP DATABASE ceva;
             postgres    false            �            1259    16909    order_product    TABLE     �   CREATE TABLE public.order_product (
    id numeric(5,0) NOT NULL,
    pid numeric(5,0) NOT NULL,
    qty numeric(5,0) NOT NULL,
    amount numeric(10,2) NOT NULL,
    order_id numeric(5,0) NOT NULL,
    status character varying(20) NOT NULL
);
 !   DROP TABLE public.order_product;
       public         postgres    false            �            1259    16906    payment_product    TABLE     �   CREATE TABLE public.payment_product (
    id numeric(5,0) NOT NULL,
    order_id numeric(5,0) NOT NULL,
    total_amount numeric(10,2) NOT NULL,
    total_due numeric(10,2) NOT NULL
);
 #   DROP TABLE public.payment_product;
       public         postgres    false            �            1259    16901    product    TABLE     �   CREATE TABLE public.product (
    id numeric(5,0) NOT NULL,
    name character varying(20) NOT NULL,
    stock numeric(5,0) NOT NULL,
    price numeric(10,2) NOT NULL
);
    DROP TABLE public.product;
       public         postgres    false                      0    16909    order_product 
   TABLE DATA               O   COPY public.order_product (id, pid, qty, amount, order_id, status) FROM stdin;
    public       postgres    false    198   �                 0    16906    payment_product 
   TABLE DATA               P   COPY public.payment_product (id, order_id, total_amount, total_due) FROM stdin;
    public       postgres    false    197                    0    16901    product 
   TABLE DATA               9   COPY public.product (id, name, stock, price) FROM stdin;
    public       postgres    false    196   A       �
           2606    16905    product order_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.product
    ADD CONSTRAINT order_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.product DROP CONSTRAINT order_pkey;
       public         postgres    false    196            �
           2606    16913    order_product order_pkey1 
   CONSTRAINT     W   ALTER TABLE ONLY public.order_product
    ADD CONSTRAINT order_pkey1 PRIMARY KEY (id);
 C   ALTER TABLE ONLY public.order_product DROP CONSTRAINT order_pkey1;
       public         postgres    false    198            �
           2606    16934    order_product prodOrderFk    FK CONSTRAINT     x   ALTER TABLE ONLY public.order_product
    ADD CONSTRAINT "prodOrderFk" FOREIGN KEY (pid) REFERENCES public.product(id);
 E   ALTER TABLE ONLY public.order_product DROP CONSTRAINT "prodOrderFk";
       public       postgres    false    2692    198    196               P   x�E�1
�0��~L��.��PB��k\JGI��B��D�ʶ��kL��*~ ����L�� �����}9
3?}2z         ,   x�350�4400�4z@�1��ej`�ʛB�aR1z\\\ )7	�         6   x�340��LNUp���N-�4400�4z\���n�y��@1C�X� Y�*     