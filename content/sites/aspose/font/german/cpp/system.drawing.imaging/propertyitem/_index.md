---
title: "System::Drawing::Imaging::PropertyItem Klasse"
linktitle: "PropertyItem"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::PropertyItem Klasse. Stellt eine Metadaten‑Eigenschaft dar, die in einer Bilddatei enthalten sein soll. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


Stellt eine Metadaten‑Eigenschaft dar, die in einer Bilddatei enthalten sein soll. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PropertyItem : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Id](./get_id/)() const | Gibt die ID der von dem aktuellen Objekt dargestellten Eigenschaft zurück. |
| [get_Len](./get_len/)() const | Gibt die Länge der von dem aktuellen Objekt dargestellten Eigenschaft in Bytes zurück. |
| [get_Type](./get_type/)() const | Gibt den Typ der von dem aktuellen Objekt dargestellten Eigenschaft in Bytes zurück. |
| [get_Value](./get_value/)() const | Gibt den Wert der durch das aktuelle Objekt dargestellten Eigenschaft in Bytes zurück. |
| [PropertyItem](./propertyitem/)() | Erstellt eine neue Instanz der Klasse [PropertyItem](./). |
| [set_Id](./set_id/)(int32_t) | Setzt die ID der durch das aktuelle Objekt dargestellten Eigenschaft. |
| [set_Len](./set_len/)(int32_t) | Setzt die Länge der durch das aktuelle Objekt dargestellten Eigenschaft in Bytes. |
| [set_Type](./set_type/)(int16_t) | Setzt den Typ der durch das aktuelle Objekt dargestellten Eigenschaft in Bytes. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | Setzt den Typ der durch das aktuelle Objekt dargestellten Eigenschaft in Bytes. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
