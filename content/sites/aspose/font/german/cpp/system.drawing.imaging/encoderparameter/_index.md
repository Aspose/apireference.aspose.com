---
title: "System::Drawing::Imaging::EncoderParameter Klasse"
linktitle: "EncoderParameter"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::EncoderParameter Klasse. Dient als Container, um Werte an einen Bild-Encoder zu übergeben. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Dient als Container, um Werte an einen Bild-Encoder zu übergeben. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncoderParameter : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die einen Bruch darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die einen Bereich von Ganzzahlwerten darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die einen Bereich von Brüchen darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Werten darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Werten darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Werten darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Brüchen darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Bereichen von Ganzzahlen darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die ein Array von Bereichen von Brüchen darstellt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Konstruiert eine neue Instanz der [EncoderParameter](./) Klasse, die die angegebene Anzahl von Werten des angegebenen Typs darstellt, die aus dem angegebenen Puffer gelesen werden. |
| [get_Encoder](./get_encoder/)() const | Gibt das [Encoder](../encoder/) Objekt zurück, das mit dem aktuellen [EncoderParameter](./) Objekt verknüpft ist. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Gibt die Anzahl des vom aktuellen Objekt dargestellten Werts zurück. |
| [get_Type](./get_type/)() const | Gibt den Typ der vom aktuellen Objekt dargestellten Werte zurück. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Verknüpft das angegebene [Encoder](../encoder/)‑Objekt mit dem aktuellen [EncoderParameter](./)‑Objekt. |
| [~EncoderParameter](./~encoderparameter/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
