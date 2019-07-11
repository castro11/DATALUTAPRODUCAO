use dataluta_db;
CREATE VIEW producao_total_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr;

CREATE VIEW producao_legume_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr
where p.categoria = 'Legume' and pr.codproduto_producao = p.codproduto;

CREATE VIEW producao_fruta_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr
where p.categoria = 'Fruta' and pr.codproduto_producao = p.codproduto;

CREATE VIEW producao_folhagem_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr
where categoria = 'Folhagem'and pr.codproduto_producao = p.codproduto;

CREATE VIEW producao_carne_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr
where categoria = 'Carne'and pr.codproduto_producao = p.codproduto;

CREATE VIEW producao_ovo_vw AS
SELECT pr.dataini as 'Data Inicial', pr.datafin as 'Data Final', p.tipoproduto as 'Produto', p.categoria as 'Categoria', pr.qualidade as 'Qualidade', pr.quantidade as 'Quantidade'  from PRODUTO p INNER JOIN PRODUCAO pr
where categoria = 'Ovo'and pr.codproduto_producao = p.codproduto;

CREATE VIEW login_vw AS
SELECT  email, senha from USUARIO;

CREATE VIEW legume_vw AS
SELECT tipoproduto from PRODUTO where categoria = "Legume";

CREATE VIEW fruta_vw AS
SELECT tipoproduto from PRODUTO where categoria = "Fruta";

CREATE VIEW folhagem_vw AS
SELECT tipoproduto from PRODUTO where categoria = "Folhagem";

CREATE VIEW carne_vw AS
SELECT tipoproduto from PRODUTO where categoria = "Carne";

CREATE VIEW ovo_vw AS
SELECT tipoproduto from PRODUTO where categoria = "Ovo";