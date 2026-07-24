---
title: "System::ComponentModel::EnumConverter Klasse"
linktitle: "EnumConverter"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::EnumConverter Klasse. Dummy‑Klasse, damit übersetzter Code, der EnumConverter verwendet, kompiliert werden kann. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Dummy‑Klasse, damit übersetzter Code, der EnumConverter verwendet, kompiliert werden kann. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Prüft, ob Typen konvertierbar sind; nicht implementiert. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Prüft, ob Typen konvertierbar sind; nicht implementiert. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Führt die eigentliche Typkonvertierung durch; nicht implementiert. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Führt die eigentliche Typkonvertierung durch; nicht implementiert. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI-Informationen. |
| [get_EnumType](./get_enumtype/)() | Ermittelt den Enum‑Typ, mit dem [EnumConverter](./) arbeitet; nicht implementiert. |
## Siehe auch

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
