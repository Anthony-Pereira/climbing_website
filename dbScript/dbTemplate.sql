--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2020-04-08 09:45:42

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 198 (class 1259 OID 38054)
-- Name: comment; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comment (
    id bigint NOT NULL,
    message character varying(255),
    title_comment character varying(255),
    user_email character varying(255)
);


ALTER TABLE public.comment OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 38052)
-- Name: comment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.comment_id_seq OWNER TO postgres;

--
-- TOC entry 2870 (class 0 OID 0)
-- Dependencies: 197
-- Name: comment_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.comment_id_seq OWNED BY public.comment.id;


--
-- TOC entry 196 (class 1259 OID 21050)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 38063)
-- Name: role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.role (
    role character varying(20) NOT NULL
);


ALTER TABLE public.role OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 38070)
-- Name: site; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.site (
    id bigint NOT NULL,
    department integer,
    description character varying(255),
    height integer,
    number_of_way integer,
    officiel_les_amis_de_lescalade boolean,
    orientation character varying(255),
    quotation character varying(255),
    title_site character varying(255),
    type character varying(255)
);


ALTER TABLE public.site OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 38068)
-- Name: site_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.site_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.site_id_seq OWNER TO postgres;

--
-- TOC entry 2871 (class 0 OID 0)
-- Dependencies: 200
-- Name: site_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.site_id_seq OWNED BY public.site.id;


--
-- TOC entry 203 (class 1259 OID 38081)
-- Name: topo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.topo (
    id bigint NOT NULL,
    available boolean,
    description character varying(255),
    location character varying(255),
    release_date character varying(255),
    title_topo character varying(255)
);


ALTER TABLE public.topo OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 38079)
-- Name: topo_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.topo_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.topo_id_seq OWNER TO postgres;

--
-- TOC entry 2872 (class 0 OID 0)
-- Dependencies: 202
-- Name: topo_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.topo_id_seq OWNED BY public.topo.id;


--
-- TOC entry 204 (class 1259 OID 38090)
-- Name: web_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.web_user (
    email character varying(40) NOT NULL,
    active boolean,
    adress character varying(255),
    city character varying(255),
    name character varying(255),
    password character varying(255),
    phone integer,
    surname character varying(255),
    zip integer
);


ALTER TABLE public.web_user OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 38098)
-- Name: web_user_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.web_user_role (
    user_email character varying(255) NOT NULL,
    role_role character varying(255) NOT NULL
);


ALTER TABLE public.web_user_role OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 38104)
-- Name: web_user_site; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.web_user_site (
    user_email character varying(255) NOT NULL,
    site_id bigint NOT NULL
);


ALTER TABLE public.web_user_site OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 38107)
-- Name: web_user_topo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.web_user_topo (
    user_email character varying(255) NOT NULL,
    topo_id bigint NOT NULL
);


ALTER TABLE public.web_user_topo OWNER TO postgres;

--
-- TOC entry 2724 (class 2604 OID 38057)
-- Name: comment id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment ALTER COLUMN id SET DEFAULT nextval('public.comment_id_seq'::regclass);


--
-- TOC entry 2725 (class 2604 OID 38073)
-- Name: site id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.site ALTER COLUMN id SET DEFAULT nextval('public.site_id_seq'::regclass);


--
-- TOC entry 2726 (class 2604 OID 38084)
-- Name: topo id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.topo ALTER COLUMN id SET DEFAULT nextval('public.topo_id_seq'::regclass);


--
-- TOC entry 2728 (class 2606 OID 38062)
-- Name: comment comment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT comment_pkey PRIMARY KEY (id);


--
-- TOC entry 2730 (class 2606 OID 38067)
-- Name: role role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (role);


--
-- TOC entry 2732 (class 2606 OID 38078)
-- Name: site site_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.site
    ADD CONSTRAINT site_pkey PRIMARY KEY (id);


--
-- TOC entry 2734 (class 2606 OID 38089)
-- Name: topo topo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.topo
    ADD CONSTRAINT topo_pkey PRIMARY KEY (id);


--
-- TOC entry 2736 (class 2606 OID 38097)
-- Name: web_user web_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user
    ADD CONSTRAINT web_user_pkey PRIMARY KEY (email);


--
-- TOC entry 2738 (class 2606 OID 38115)
-- Name: web_user_role fk1eklw217b76m8ow2q35y4vswc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_role
    ADD CONSTRAINT fk1eklw217b76m8ow2q35y4vswc FOREIGN KEY (role_role) REFERENCES public.role(role);


--
-- TOC entry 2743 (class 2606 OID 38140)
-- Name: web_user_topo fk5gnk960x3aqf2bdi8tmqvtq8q; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_topo
    ADD CONSTRAINT fk5gnk960x3aqf2bdi8tmqvtq8q FOREIGN KEY (user_email) REFERENCES public.web_user(email);


--
-- TOC entry 2739 (class 2606 OID 38120)
-- Name: web_user_role fkda3py7l80uunvybweuv185df9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_role
    ADD CONSTRAINT fkda3py7l80uunvybweuv185df9 FOREIGN KEY (user_email) REFERENCES public.web_user(email);


--
-- TOC entry 2742 (class 2606 OID 38135)
-- Name: web_user_topo fke5u481o7xf20m7f94l9gd62hd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_topo
    ADD CONSTRAINT fke5u481o7xf20m7f94l9gd62hd FOREIGN KEY (topo_id) REFERENCES public.topo(id);


--
-- TOC entry 2740 (class 2606 OID 38125)
-- Name: web_user_site fkeoqpd7eb0jsmn2m8lech6ppaj; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_site
    ADD CONSTRAINT fkeoqpd7eb0jsmn2m8lech6ppaj FOREIGN KEY (site_id) REFERENCES public.site(id);


--
-- TOC entry 2741 (class 2606 OID 38130)
-- Name: web_user_site fkin45uuknufsbuqsvygelh8u2n; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.web_user_site
    ADD CONSTRAINT fkin45uuknufsbuqsvygelh8u2n FOREIGN KEY (user_email) REFERENCES public.web_user(email);


--
-- TOC entry 2737 (class 2606 OID 38110)
-- Name: comment fkj6sn2hl9x583rng287wsomum4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fkj6sn2hl9x583rng287wsomum4 FOREIGN KEY (user_email) REFERENCES public.web_user(email);


-- Completed on 2020-04-08 09:45:42

--
-- PostgreSQL database dump complete
--

