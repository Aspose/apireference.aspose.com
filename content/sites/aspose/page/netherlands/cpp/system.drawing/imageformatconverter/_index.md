---
title: "System::Drawing::ImageFormatConverter klasse"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::ImageFormatConverter klasse. Converteert ImageFormat-objecten van het ene gegevenstype naar het andere. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1400
url: /nl/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


Converteert ImageFormat-objecten van het ene gegevenstype naar het andere. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Converteert objecten. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Converteert objecten. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Converteert objecten. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Converteert string naar object. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Converteert object naar een specifiek type. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converteert object naar een specifiek type. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converteert object naar een specifiek type. |
| [ImageFormatConverter](./imageformatconverter/)() | Construeert een nieuwe instantie van [ImageFormatConverter](./). |
## Zie ook

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
