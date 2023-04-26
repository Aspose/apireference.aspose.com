---
title: Class UserProperties
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.UserProperties klass. Särskild egenskapsklass som gör att inskrivna egenskaper kan ställas in och returneras. Det tillåter också att kopplingen av två standardegenskapsobjekt objekt kan sökas om detta egenskapsobjekt inte innehåller egenskapen.
type: docs
weight: 320
url: /sv/net/aspose.page/userproperties/
---
## UserProperties class

Särskild egenskapsklass som gör att inskrivna egenskaper kan ställas in och returneras. Det tillåter också att kopplingen av två standardegenskapsobjekt objekt kan sökas om detta egenskapsobjekt inte innehåller egenskapen.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [UserProperties](userproperties/#constructor)() | Initierar en tom instans av klassen UserProperties. |
| [UserProperties](userproperties/#constructor_1)(Dictionary&lt;string, object&gt;) | Initierar en av UserProperties-klassen med standardvärden. |
| [UserProperties](userproperties/#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Konstruerar UserProperties med en standard- och altDefaults-tabell, som söks i den ordningen. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties/) { set; } | Kopierar egenskaper, inklusive dess standardinställningar till denna UserProperties |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty)(string) | Får strängegenskapsvärde. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty_1)(string, string) | Hämtar strängegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor)(string) | Får färgegenskapsvärde. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor_1)(string, Color) | Får färgegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble)(string) | Får dubbelt egenskapsvärde. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble_1)(string, double) | Får dubbelt egenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat)(string) | Får flytande egenskapsvärde. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat_1)(string, float) | Får flytegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint)(string) | Får heltalsegenskapsvärde. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint_1)(string, int) | Får heltalsegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins)(string) | Får marginalegenskapsvärde. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins_1)(string, Margins) | Får marginalegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle)(string) | Får rektangelegenskapsvärde. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle_1)(string, RectangleF) | Får rektangelegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize)(string) | Får storleksegenskapsvärde. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize_1)(string, Size) | Får storleksegenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray)(string) | Hämtar egenskapsvärde för strängmatris. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray_1)(string, string[]) | Hämtar egenskapsvärde för strängmatris. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty)(string) | Får booleskt egenskapsvärde. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty_1)(string, bool) | Får booleskt egenskapsvärde. Om den begärda egenskapen saknas, returnerar det angivna standardvärdet. |
| virtual [PrintProperties](../../aspose.page/userproperties/printproperties/)() |  |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames/)() | Returnerar egenskapsnamn. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(string, bool) | Ställer in booleskt egenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(string, Color) | Anger färgegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(string, double) | Anger dubbelt egenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(string, float) | Anger flytande egenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(string, int) | Anger heltalsegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(string, Margins) | Anger marginalegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(string, Rectangle) | Anger rektangelegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(string, Size) | Anger storleksegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(string, string) | Anger strängegenskapsvärde. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_9)(string, string[]) | Anger egenskapsvärde för strängmatris. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Ställer in booleskt egenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Anger färgegenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Anger dubbelt egenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Anger flytande egenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Anger heltalsegenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Anger marginalegenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Anger rektangelegenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Anger storleksegenskapsvärde i specificerad egenskapstabell. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Anger egenskapsvärde för strängmatris i specificerad egenskapstabell. |

### Se även

* namnutrymme [Aspose.Page](../../aspose.page/)
* hopsättning [Aspose.Page](../../)


