---
title: Interface ICSSImportRule
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Dom.Css.ICSSImportRule koppel. Die CSSImportRuleSchnittstelle repräsentiert eine importRegel innerhalb eines CSSStylesheets. Die importRegel wird verwendet um Stilregeln aus anderen Stilvorlagen zu importieren.
type: docs
weight: 560
url: /de/net/aspose.svg.dom.css/icssimportrule/
---
## ICSSImportRule interface

Die CSSImportRule-Schnittstelle repräsentiert eine @import-Regel innerhalb eines CSS-Stylesheets. Die @import-Regel wird verwendet, um Stilregeln aus anderen Stilvorlagen zu importieren.

```csharp
public interface ICSSImportRule : ICSSRule
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Href](../../aspose.svg.dom.css/icssimportrule/href/) { get; } | Der Speicherort des zu importierenden Stylesheets. Das Attribut enthält nicht den Spezifizierer "url(...)" um den URI. |
| [Media](../../aspose.svg.dom.css/icssimportrule/media/) { get; } | Eine Liste von Medientypen, für die dieses Stylesheet verwendet werden kann. |
| [StyleSheet](../../aspose.svg.dom.css/icssimportrule/stylesheet/) { get; } | Das Stylesheet, auf das sich diese Regel bezieht, falls es geladen wurde. Der Wert dieses Attributs ist null, wenn das Stylesheet noch nicht geladen wurde oder nicht geladen wird (z. B. wenn das Stylesheet für einen Medientyp ist, der vom Benutzerprogramm nicht unterstützt wird). |

### Siehe auch

* interface [ICSSRule](../icssrule/)
* namensraum [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* Montage [Aspose.SVG](../../)


