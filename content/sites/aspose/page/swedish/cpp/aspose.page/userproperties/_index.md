---
title: "Aspose::Page::UserProperties klass"
linktitle: "UserProperties"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::UserProperties klass. Speciell egenskapsklass som tillåter att typade egenskaper sätts och hämtas. Den tillåter också att två standardegenskapsobjekt kopplas ihop för att sökas om detta egenskapsobjekt inte innehåller egenskapen i C++."
type: docs
weight: 1600
url: /sv/cpp/aspose.page/userproperties/
---
## UserProperties class


Speciell egenskapsklass som tillåter att typade egenskaper sätts och returneras. Den möjliggör också att två standardegenskapsobjekt kopplas ihop för sökning om detta egenskapsobjekt inte innehåller egenskapen.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Hämtar strängegenskapens värde. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Hämtar strängegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Hämtar färgegenskapens värde. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Hämtar färgegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Hämtar dubbelegenskapens värde. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Hämtar dubbelegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Hämtar flyttalsegenskapens värde. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Hämtar flyttalsegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Hämtar heltalsegenskapens värde. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Hämtar heltalsegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Hämtar marginalegenskapens värde. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Hämtar marginalegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Hämtar matrisegenskapens värde. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Hämtar matrisegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Hämtar rektangelegenskapens värde. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Hämtar rektangelegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Hämtar storleksegenskapens värde. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Hämtar storleksegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Hämtar strängarrayegenskapens värde. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Hämtar strängarrayegenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [IsProperty](./isproperty/)(System::String) | Hämtar boolesk egenskapens värde. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Hämtar boolesk egenskapens värde. Om den begärda egenskapen saknas returneras det angivna standardvärdet. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Returnerar egenskapsnamn. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Kopierar egenskaper, inklusive dess standardvärden, till detta [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Sätter strängegenskapens värde. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Ställer in värdet för string array‑egenskapen. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Ställer in värdet för string array‑egenskapen i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Ställer in färgegenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Ställer in färgegenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Ställer in rektangel‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Ställer in rektangel‑egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Ställer in marginalegenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Ställer in marginalegenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Ställer in storleks‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Ställer in storleks‑egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Ställer in heltals‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Ställer in heltals‑egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Ställer in dubbel‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Ställer in dubbel‑egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Ställer in flyttals‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Ställer in flyttals‑egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Ställer in boolesk egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Ställer in boolesk egenskapens värde i angiven egenskapstabell. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ställer in matris‑egenskapens värde. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ställer in matris‑egenskapens värde i angiven egenskapstabell. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |
| [UserProperties](./userproperties/)() | Initierar en tom instans av [UserProperties](./)‑klassen. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Initierar en [UserProperties](./)‑klass med standardvärden. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Skapar [UserProperties](./) med en defaults‑ och altDefaults‑tabell, som söks i den ordningen. |
## Se även

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
