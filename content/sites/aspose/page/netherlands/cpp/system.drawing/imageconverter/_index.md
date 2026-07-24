---
title: "System::Drawing::ImageConverter klasse"
linktitle: "ImageConverter"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::ImageConverter klasse. Converteert Image-objecten van het ene gegevenstype naar het andere. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1300
url: /nl/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Converteert [Image](../image/) objecten van het ene gegevenstype naar het andere. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Converteert object naar een specifiek type. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converteert object naar een specifiek type. |
| [ImageConverter](./imageconverter/)() | Construeert een nieuwe instantie van [ImageConverter](./). |
## Zie ook

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
