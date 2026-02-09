/* ============================
   REFATORAÇÃO DE COMICS
   ============================ */

/* ========= TB_COMICS ========= */

/* Remove relacionamento antigo com publisher (se existir) */
ALTER TABLE TB_COMICS
    DROP COLUMN IF EXISTS publisher_id;

/* Nome da editora como texto simples */
ALTER TABLE TB_COMICS
    ADD COLUMN IF NOT EXISTS nome_editora VARCHAR(255);

/* URL da capa da HQ */
ALTER TABLE TB_COMICS
    ADD COLUMN IF NOT EXISTS img_url VARCHAR(500);


/* ========= TB_PUBLISHERS ========= */
/* Agora funciona como "wiki", sem relação com comic */

ALTER TABLE TB_PUBLISHERS
    ADD COLUMN IF NOT EXISTS descricao VARCHAR(500);

ALTER TABLE TB_PUBLISHERS
    ADD COLUMN IF NOT EXISTS fundacao VARCHAR(50);

ALTER TABLE TB_PUBLISHERS
    ADD COLUMN IF NOT EXISTS site_oficial VARCHAR(255);


/* ========= TB_AUTORES ========= */

ALTER TABLE TB_AUTORES
    ALTER COLUMN nome SET NOT NULL;


/* ========= TB_CHARACTERS ========= */

ALTER TABLE TB_CHARACTERS
    ALTER COLUMN nome SET NOT NULL;


/* ========= RELACIONAMENTOS ========= */
/* HQ <-> AUTORES */

ALTER TABLE HQ_AUTORES
    ADD CONSTRAINT IF NOT EXISTS fk_hq_autores_hq
    FOREIGN KEY (hq_id) REFERENCES TB_COMICS(id);

ALTER TABLE HQ_AUTORES
    ADD CONSTRAINT IF NOT EXISTS fk_hq_autores_autor
    FOREIGN KEY (autor_id) REFERENCES TB_AUTORES(id);


/* HQ <-> PERSONAGENS */

ALTER TABLE HQ_PERSONAGENS
    ADD CONSTRAINT IF NOT EXISTS fk_hq_personagens_hq
    FOREIGN KEY (hq_id) REFERENCES TB_COMICS(id);

ALTER TABLE HQ_PERSONAGENS
    ADD CONSTRAINT IF NOT EXISTS fk_hq_personagens_personagem
    FOREIGN KEY (personagem_id) REFERENCES TB_CHARACTERS(id);
