---
title: Interface ICSSImportRule
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.Css.ICSSImportRule koppel. De interface CSSImportRule vertegenwoordigt een importregel binnen een CSSstijlblad. De importregel wordt gebruikt om stijlregels uit andere stijlbladen te importeren.
type: docs
weight: 560
url: /nl/net/aspose.svg.dom.css/icssimportrule/
---
## ICSSImportRule interface

De interface CSSImportRule vertegenwoordigt een @import-regel binnen een CSS-stijlblad. De @import-regel wordt gebruikt om stijlregels uit andere stijlbladen te importeren.

```csharp
public interface ICSSImportRule : ICSSRule
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Href](../../aspose.svg.dom.css/icssimportrule/href/) { get; } | De locatie van de te importeren stijlpagina. Het kenmerk bevat niet de "url(...)"-specificatie rond de URI. |
| [Media](../../aspose.svg.dom.css/icssimportrule/media/) { get; } | Een lijst met mediatypen waarvoor deze stylesheet kan worden gebruikt. |
| [StyleSheet](../../aspose.svg.dom.css/icssimportrule/stylesheet/) { get; } | De stijlpagina waarnaar deze regel verwijst, als deze is geladen. De waarde van dit attribuut is null als de stijlpagina nog niet is geladen of als deze niet zal worden geladen (bijv. als de stijlpagina voor een mediatype is dat niet wordt ondersteund door de user agent). |

### Zie ook

* interface [ICSSRule](../icssrule/)
* naamruimte [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* montage [Aspose.SVG](../../)


