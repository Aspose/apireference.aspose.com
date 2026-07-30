---
title: "System::Drawing::ImageFormatConverter Klasse"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font für C++"
description: "System::Drawing::ImageFormatConverter Klasse. Konvertiert ImageFormat-Objekte von einem Datentyp in einen anderen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


Konvertiert ImageFormat-Objekte von einem Datentyp in einen anderen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Konvertiert Objekte. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Konvertiert Objekte. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Konvertiert Objekte. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Konvertiert Zeichenkette in Objekt. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Konvertiert ein Objekt in einen spezifischen Typ. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Konvertiert ein Objekt in einen spezifischen Typ. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Konvertiert ein Objekt in einen spezifischen Typ. |
| [ImageFormatConverter](./imageformatconverter/)() | Erstellt eine neue Instanz von [ImageFormatConverter](./). |
## Siehe auch

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
