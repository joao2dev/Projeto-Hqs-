-- remover relacionamento antigo com editora
ALTER TABLE TB_COMICS
DROP COLUMN IF EXISTS PUBLISHER_ID;

-- nova coluna de texto para editora
ALTER TABLE TB_COMICS
ADD COLUMN EDITORA VARCHAR(255);

-- coluna para capa do gibi
ALTER TABLE TB_COMICS
ADD COLUMN IMG_URL VARCHAR(500);
