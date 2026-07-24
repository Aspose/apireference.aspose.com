---
title: "System::ComponentModel::EnumConverter-klass"
linktitle: "EnumConverter"
second_title: "Aspose.Page för C++"
description: "System::ComponentModel::EnumConverter-klass. Dummy‑klass för översatt kod som använder EnumConverter för att kunna kompileras. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrappa alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 700
url: /sv/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Dummy‑klass för översatt kod som använder EnumConverter för att kunna kompileras. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrappa alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Kontrollerar om typer är konverterbara; ej implementerat. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Kontrollerar om typer är konverterbara; ej implementerat. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Utför faktisk typkonvertering; ej implementerat. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Utför faktisk typkonvertering; ej implementerat. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI-information. |
| [get_EnumType](./get_enumtype/)() | Hämtar enum-typ som [EnumConverter](./) arbetar med; ej implementerad. |
## Se även

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
