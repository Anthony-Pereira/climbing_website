--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2020-04-08 09:44:40

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

--
-- TOC entry 2873 (class 0 OID 38090)
-- Dependencies: 204
-- Data for Name: web_user; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2867 (class 0 OID 38054)
-- Dependencies: 198
-- Data for Name: comment; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2868 (class 0 OID 38063)
-- Dependencies: 199
-- Data for Name: role; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2870 (class 0 OID 38070)
-- Dependencies: 201
-- Data for Name: site; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2872 (class 0 OID 38081)
-- Dependencies: 203
-- Data for Name: topo; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2874 (class 0 OID 38098)
-- Dependencies: 205
-- Data for Name: web_user_role; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2875 (class 0 OID 38104)
-- Dependencies: 206
-- Data for Name: web_user_site; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2876 (class 0 OID 38107)
-- Dependencies: 207
-- Data for Name: web_user_topo; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2882 (class 0 OID 0)
-- Dependencies: 197
-- Name: comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comment_id_seq', 1, false);


--
-- TOC entry 2883 (class 0 OID 0)
-- Dependencies: 196
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- TOC entry 2884 (class 0 OID 0)
-- Dependencies: 200
-- Name: site_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.site_id_seq', 1, false);


--
-- TOC entry 2885 (class 0 OID 0)
-- Dependencies: 202
-- Name: topo_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.topo_id_seq', 1, false);


-- Completed on 2020-04-08 09:44:41

--
-- PostgreSQL database dump complete
--

