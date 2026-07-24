---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Pen class. Vertegenwoordigt eigenschappen zoals kleur, breedte enz. van de lijnen en curven die worden getekend. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.drawing/pen/
---
## Pen class


Vertegenwoordigt eigenschappen zoals kleur, breedte enz. van de lijnen en curven die worden getekend. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Pen : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Retourneert een kopie van het huidige object. |
| [Dispose](./dispose/)() | Vrijgeeft alle operationele bronnen die door het huidige object zijn verkregen. |
| [get_Alignment](./get_alignment/)() const | Retourneert een waarde die de uitlijning van het huidige [Pen](./) object aangeeft. |
| [get_Brush](./get_brush/)() | Retourneert het [Brush](../brush/) object van deze pen. |
| [get_Color](./get_color/)() const | Retourneert de kleur van deze pen. |
| [get_CompoundArray](./get_compoundarray/)() const | Retourneert een array met waarden die een samengestelde pen specificeert. |
| [get_DashCap](./get_dashcap/)() const | Retourneert een waarde die de cap aangeeft die aan beide uiteinden van een gestippelde lijn wordt gebruikt. |
| [get_DashOffset](./get_dashoffset/)() const | Retourneert de afstand van het begin van een lijn tot het begin van een stippellijnpatroon. |
| [get_DashPattern](./get_dashpattern/)() const | Retourneert een array die een aangepast stippellijnpatroon in een gestippelde lijn aangeeft. |
| [get_DashStyle](./get_dashstyle/)() const | Retourneert een waarde die de stippelstijl van het huidige [Pen](./) object aangeeft. |
| [get_EndCap](./get_endcap/)() const | Retourneert een waarde die de eindlijncap van het huidige [Pen](./) object aangeeft. |
| [get_LineJoin](./get_linejoin/)() const | Retourneert een waarde die aangeeft hoe de lijnen die door dit [Pen](./) object worden getekend, worden samengevoegd. |
| [get_MiterLimit](./get_miterlimit/)() const | Retourneert de limiet van de dikte van de verbinding op een afgeschuinde hoek. |
| [get_PenType](./get_pentype/)() const | NOG NIET GEÏMPLENTEERD. |
| [get_StartCap](./get_startcap/)() const | Retourneert een waarde die de startlijncap van het huidige [Pen](./) object aangeeft. |
| [get_Transform](./get_transform/)() | Retourneert een kopie van een Matrix-object dat de geometrische transformaties specificeert voor de pen die door het huidige object wordt weergegeven. |
| [get_Width](./get_width/)() const | Retourneert de breedte van het huidige [Pen](./) object. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Vermenigvuldigt de transformatiematrix van het huidige object met de opgegeven matrix. |
| [Pen](./pen/)(const Color\&) | Construeert een nieuw [Pen](./) object dat de opgegeven kleur vertegenwoordigt. |
| [Pen](./pen/)(const Color\&, float) | Construeert een nieuw [Pen](./) object dat de opgegeven kleur en breedte vertegenwoordigt. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Construeert een nieuw [Pen](./) object en initialiseert het met het opgegeven [Brush](../brush/) object. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Construeert een nieuw [Pen](./) object en initialiseert het met het opgegeven [Brush](../brush/) object. |
| [ResetTransform](./resettransform/)() | Reset de transformatiematrix van het huidige object zodat deze een identiteitsmatrix wordt. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoek in de opgegeven volgorde. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven factoren in de opgegeven volgorde. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Stelt de uitlijning van het huidige [Pen](./) object in. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Stelt het [Brush](../brush/) object van deze pen in. |
| [set_Color](./set_color/)(const Color\&) | Stelt de kleur van deze pen in. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Stelt een array met waarden in die een samengestelde pen specificeert. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Stelt de aangepaste eindlijncap in. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Stelt de aangepaste startlijncap in. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Stelt een waarde in die de cap specificeert die aan beide uiteinden van een gestippelde lijn wordt gebruikt. |
| [set_DashOffset](./set_dashoffset/)(float) | Stelt de afstand in van het begin van een lijn tot het begin van een stippellijnpatroon. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Stelt een array in die een aangepast stippellijnpatroon in een gestippelde lijn specificeert. De array bestaat uit getallen die de lengtes van afwisselende stippels en spaties aangeven. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Stelt een waarde in die de stippelstijl van het huidige [Pen](./) object specificeert. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Stelt de eindlijncap van het huidige [Pen](./) object in. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Stelt een waarde in die aangeeft hoe de lijnen die door dit [Pen](./) object worden getekend, worden verbonden. |
| [set_MiterLimit](./set_miterlimit/)(float) | Stelt de limiet in van de dikte van de verbinding op een afgeschuinde hoek. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Stelt de startlijnkap van het huidige [Pen](./) object in. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Stelt een Matrix-object in dat de geometrische transformaties specificeert voor de pen die door het huidige object wordt weergegeven. |
| [set_Width](./set_width/)(float) | Stelt de breedte in van het huidige [Pen](./) object. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | NOG NIET GEÏMPLENTEERD. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Vertaalt de lokale geometrische transformatie met de opgegeven afmetingen in de opgegeven volgorde. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
