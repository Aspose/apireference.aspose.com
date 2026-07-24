---
title: "System::Drawing::TextureBrush-klasse"
linktitle: "TextureBrush"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::TextureBrush-klasse. Vertegenwoordigt een penseel dat een afbeelding gebruikt om het binnenste van een vorm te vullen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2800
url: /nl/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Vertegenwoordigt een penseel dat een afbeelding gebruikt om het binnenste van een vorm te vullen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Maakt een kopie van het huidige object. |
| [get_Image](./get_image/)() | Retourneert een afbeelding die door het huidige [TextureBrush](./)-object wordt gebruikt. |
| [get_Transform](./get_transform/)() | Retourneert een kopie van een Matrix-object dat de geometrische transformaties voor het penseel dat door het huidige object wordt weergegeven, specificeert. |
| [get_WrapMode](./get_wrapmode/)() | Retourneert een waarde die aangeeft hoe het penseel dat door het huidige object wordt weergegeven, getegeld is. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Vermenigvuldigt de transformatiematrix van het huidige object met de opgegeven matrix. |
| [ResetTransform](./resettransform/)() | Reset de transformatiematrix van het huidige object zodat deze een identiteitsmatrix wordt. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoek in de opgegeven volgorde. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven factoren in de opgegeven volgorde. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Stelt een Matrix-object in dat de geometrische transformaties voor het penseel dat door het huidige object wordt weergegeven, specificeert. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Stelt een waarde in die aangeeft hoe het penseel dat door het huidige object wordt weergegeven, getegeld is. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Construeert een nieuwe instantie van de [TextureBrush](./)-klasse die de opgegeven afbeelding gebruikt. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construeert een nieuwe instantie van de [TextureBrush](./)-klasse die de opgegeven afbeelding gebruikt. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construeert een nieuwe instantie van de [TextureBrush](./)-klasse die de opgegeven afbeelding gebruikt. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Construeert een nieuwe instantie van de [TextureBrush](./)-klasse die de opgegeven afbeelding gebruikt. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Construeert een nieuwe instantie van de [TextureBrush](./)-klasse die de opgegeven afbeelding gebruikt. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Vertaalt de lokale geometrische transformatie met de opgegeven afmetingen in de opgegeven volgorde. |
| virtual [~TextureBrush](./~texturebrush/)() | Destructor. |
## Zie ook

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
