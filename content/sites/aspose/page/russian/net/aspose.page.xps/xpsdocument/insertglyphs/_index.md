---
title: XpsDocument.InsertGlyphs
second_title: Справочник по Aspose.Page для .NET API
description: XpsDocument метод. Вставляет новые глифы на активную страницу по адресуindex позиция.
type: docs
weight: 420
url: /ru/net/aspose.page.xps/xpsdocument/insertglyphs/
---
## InsertGlyphs(int, string, float, FontStyle, float, float, string) {#insertglyphs_1}

Вставляет новые глифы на активную страницу по адресу*index* позиция.

```csharp
public XpsGlyphs InsertGlyphs(int index, string fontFamily, float fontSize, FontStyle fontStyle, 
    float originX, float originY, string unicodeString)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| index | Int32 | Позиция, в которой должны быть вставлены новые глифы. |
| fontFamily | String | Семейство шрифтов. |
| fontSize | Single | Размер шрифта. |
| fontStyle | FontStyle | Стиль шрифта. |
| originX | Single | Координата X начала координат глифов. |
| originY | Single | Координата Y начала координат глифов. |
| unicodeString | String | Строка для печати. |

### Возвращаемое значение

Вставленные глифы.

### Смотрите также

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsDocument](../)
* пространство имен [Aspose.Page.XPS](../../xpsdocument/)
* сборка [Aspose.Page](../../../)

---

## InsertGlyphs(int, XpsFont, float, float, float, string) {#insertglyphs}

Вставляет новые глифы на активную страницу по адресу*index* позиция.

```csharp
public XpsGlyphs InsertGlyphs(int index, XpsFont font, float fontSize, float originX, 
    float originY, string unicodeString)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| index | Int32 | Позиция, в которой должны быть вставлены новые глифы. |
| font | XpsFont | Ресурс шрифта. |
| fontSize | Single | Размер шрифта. |
| originX | Single | Координата X начала координат глифов. |
| originY | Single | Координата Y начала координат глифов. |
| unicodeString | String | Строка для печати. |

### Возвращаемое значение

Вставленные глифы.

### Смотрите также

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* class [XpsDocument](../)
* пространство имен [Aspose.Page.XPS](../../xpsdocument/)
* сборка [Aspose.Page](../../../)


