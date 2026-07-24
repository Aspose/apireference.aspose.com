---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas sınıfı"
linktitle: "XpsCanvas"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas sınıfı. Canvas öğesi özelliklerini kapsayan sınıf. Bu öğe öğeleri bir arada gruplar. Örneğin, Glyphs ve Path öğeleri bir canvas içinde bir birim olarak (bir bağlantı hedefi gibi) tanımlanabilmesi veya C++'ta her alt ve üst öğeye birleştirilmiş bir özellik değeri uygulanabilmesi için gruplanabilir."
type: docs
weight: 500
url: /tr/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Canvas öğesi özelliklerini kapsayan sınıf. Bu öğe öğeleri bir arada gruplar. Örneğin, Glyphs ve Path öğeleri bir canvas içinde bir birim olarak (bir bağlantı hedefi olarak) tanımlanabilmesi veya her çocuk ve üst öğeye birleşik bir özellik değeri uygulanabilmesi için gruplanabilir.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(T) | Bu canvas'ın alt öğe listesine bir öğe ekler. |
| [AddCanvas](./addcanvas/)() | Bu canvas'ın alt öğe listesine yeni bir canvas ekler. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Bu canvas'ın alt öğe listesine yeni glyph'ler ekler. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Bu canvas'ın alt öğe listesine yeni bir path ekler. |
| [Clone](./clone/)() | Bu canvas'ı klonlar. |
| [get_EdgeMode](./get_edgemode/)() const | Canvas içindeki path'lerin kenarlarının nasıl render edildiğini kontrol eden değeri döndürür/ayarlar. |
| [Insert](./insert/)(int32_t, T) | Bu canvas'ın alt öğe listesine *index*  position. bir öğe ekler. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Bu canvas'ın alt öğe listesine *index*  position. yeni bir canvas ekler. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Bu canvas'ın alt öğe listesine *index*  position. yeni glyph'ler ekler. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Bu canvas'ın alt öğe listesine *index*  position. yeni bir path ekler. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Canvas içindeki path'lerin kenarlarının nasıl render edildiğini kontrol eden değeri döndürür/ayarlar. |
## Ayrıca Bakınız

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
