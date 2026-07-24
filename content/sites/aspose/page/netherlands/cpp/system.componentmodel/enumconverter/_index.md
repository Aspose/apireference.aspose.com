---
title: "System::ComponentModel::EnumConverter klasse"
linktitle: "EnumConverter"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::EnumConverter klasse. Dummy‑klasse voor EnumConverter‑gebruikende vertaalde code om te compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Dummy‑klasse voor EnumConverter‑gebruikende vertaalde code om te compileren. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Controleert of types converteerbaar zijn; niet geïmplementeerd. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Controleert of types converteerbaar zijn; niet geïmplementeerd. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Voert daadwerkelijke typeconversie uit; niet geïmplementeerd. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Voert daadwerkelijke typeconversie uit; niet geïmplementeerd. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI-informatie. |
| [get_EnumType](./get_enumtype/)() | Haalt het enum‑type op waarmee [EnumConverter](./) werkt; niet geïmplementeerd. |
## Zie ook

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
