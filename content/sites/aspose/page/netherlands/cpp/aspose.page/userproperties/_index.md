---
title: "Aspose::Page::UserProperties klasse"
linktitle: "UserProperties"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::UserProperties klasse. Speciale eigenschapklasse die het mogelijk maakt getypeerde eigenschappen in te stellen en op te halen. Het maakt ook de koppeling van twee standaard eigenschapsobjecten mogelijk om te zoeken als dit eigenschapsobject de eigenschap niet bevat in C++."
type: docs
weight: 1600
url: /nl/cpp/aspose.page/userproperties/
---
## UserProperties class


Speciale eigenschapsklasse die het instellen en teruggeven van getypeerde eigenschappen mogelijk maakt. Het maakt ook het koppelen van twee standaard eigenschapsobjecten mogelijk die worden doorzocht als dit eigenschapsobject de eigenschap niet bevat.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Haalt de string-waarde van de eigenschap op. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Haalt de string-waarde van de eigenschap op. Als de gevraagde eigenschap afwezig is, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Haalt de kleur‑eigenschapwaarde op. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Haalt de kleur‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Haalt de double‑eigenschapwaarde op. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Haalt de double‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Haalt de float‑eigenschapwaarde op. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Haalt de float‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Haalt de integer‑eigenschapwaarde op. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Haalt de integer‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Haalt de marges‑eigenschapwaarde op. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Haalt de marges‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Haalt de matrix‑eigenschapwaarde op. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Haalt de matrix‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Haalt de rechthoek‑eigenschapwaarde op. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Haalt de rechthoek‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Haalt de grootte‑eigenschapwaarde op. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Haalt de grootte‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Haalt de string‑array‑eigenschapwaarde op. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Haalt de string‑array‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [IsProperty](./isproperty/)(System::String) | Haalt de boolean‑eigenschapwaarde op. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Haalt de boolean‑eigenschapwaarde op. Als de gevraagde eigenschap ontbreekt, wordt de opgegeven standaardwaarde geretourneerd. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Retourneert eigenschapsnamen. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Kopieert eigenschappen, inclusief de standaardwaarden, naar deze [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Stelt de string‑eigenschapwaarde in. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Stelt de string‑array‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Stelt de string‑array‑eigenschapwaarde in de opgegeven eigenschappentabel in. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Stelt de kleur‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Stelt de kleur‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Stelt de rechthoek‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Stelt de rechthoek‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Stelt de marges‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Stelt de marges‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Stelt de grootte‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Stelt de grootte‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Stelt de integer‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Stelt de integer‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Stelt de double‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Stelt de double‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Stelt de float‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Stelt de float‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Stelt de boolean‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Stelt de boolean‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Stelt de matrix‑eigenschapwaarde in. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Stelt de matrix‑eigenschapwaarde in de opgegeven eigenschappen‑tabel in. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
| [UserProperties](./userproperties/)() | Initialiseert een lege instantie van de klasse [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Initialiseert een instantie van de klasse [UserProperties](./) met standaardwaarden. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Construeert [UserProperties](./) met een defaults‑ en altDefaults‑tabel, die in die volgorde worden doorzocht. |
## Zie ook

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
