---
title: "System::Drawing::ImageConverter Klasse"
linktitle: "ImageConverter"
second_title: "Aspose.Font für C++"
description: "System::Drawing::ImageConverter Klasse. Konvertiert Image-Objekte von einem Datentyp in einen anderen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Konvertiert [Image](../image/) Objekte von einem Datentyp in einen anderen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Konvertiert ein Objekt in einen spezifischen Typ. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Konvertiert ein Objekt in einen spezifischen Typ. |
| [ImageConverter](./imageconverter/)() | Erstellt eine neue Instanz von [ImageConverter](./). |
## Siehe auch

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
