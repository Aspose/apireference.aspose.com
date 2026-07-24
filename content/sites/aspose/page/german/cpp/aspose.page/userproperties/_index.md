---
title: "Klasse Aspose::Page::UserProperties"
linktitle: "UserProperties"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::UserProperties Klasse. Spezielle Eigenschaftsklasse, die das Setzen und Abrufen typisierter Eigenschaften ermöglicht. Sie erlaubt außerdem das Verknüpfen von zwei Standard-Eigenschaftsobjekten, die durchsucht werden, falls dieses Eigenschaftsobjekt die gesuchte Eigenschaft in C++ nicht enthält."
type: docs
weight: 1600
url: /de/cpp/aspose.page/userproperties/
---
## UserProperties class


Spezielle Eigenschaftsklasse, die das Setzen und Zurückgeben typisierter Eigenschaften ermöglicht. Sie erlaubt außerdem das Verknüpfen von zwei Standard‑Eigenschaftsobjekten, die durchsucht werden, falls dieses Eigenschaftsobjekt die gesuchte Eigenschaft nicht enthält.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Liest den String-Eigenschaftswert. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Liest den String-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Liest den Farbe-Eigenschaftswert. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Liest den Farbe-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Liest den Double-Eigenschaftswert. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Liest den Double-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Liest den Float-Eigenschaftswert. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Liest den Float-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Liest den Integer-Eigenschaftswert. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Liest den Integer-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Liest den Ränder-Eigenschaftswert. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Liest den Ränder-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Liest den Matrix-Eigenschaftswert. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Liest den Matrix-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Liest den Rechteck-Eigenschaftswert. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Liest den Rechteck-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Liest den Größe-Eigenschaftswert. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Liest den Größe-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Liest den String-Array-Eigenschaftswert. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Liest den String-Array-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [IsProperty](./isproperty/)(System::String) | Liest den Boolean-Eigenschaftswert. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Liest den Boolean-Eigenschaftswert. Wenn die angeforderte Eigenschaft fehlt, wird der bereitgestellte Standardwert zurückgegeben. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Gibt Eigenschaftsnamen zurück. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Kopiert Eigenschaften, einschließlich ihrer Standardwerte, in dieses [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Setzt den String-Eigenschaftswert. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Setzt den Wert der Zeichenketten-Array-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Setzt den Wert der Zeichenketten-Array-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Setzt den Wert der Farbeigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Setzt den Wert der Farbeigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Setzt den Wert der Rechteckeigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Setzt den Wert der Rechteckeigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Setzt den Wert der Rand-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Setzt den Wert der Rand-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Setzt den Wert der Größeneigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Setzt den Wert der Größeneigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Setzt den Wert der Ganzzahl-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Setzt den Wert der Ganzzahl-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Setzt den Wert der double-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Setzt den Wert der double-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Setzt den Wert der float-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Setzt den Wert der float-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Setzt den Wert der boolean-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Setzt den Wert der boolean-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Setzt den Wert der Matrix-Eigenschaft. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Setzt den Wert der Matrix-Eigenschaft in der angegebenen Eigenschaften-Tabelle. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |
| [UserProperties](./userproperties/)() | Initialisiert eine leere Instanz der Klasse [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Initialisiert eine Instanz der Klasse [UserProperties](./) mit Standardwerten. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Konstruiert [UserProperties](./) mit einer defaults- und altDefaults-Tabelle, die in dieser Reihenfolge durchsucht werden. |
## Siehe auch

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
