---
title: Interface ISVGAnimatedPathData
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Paths.ISVGAnimatedPathData interfaccia. Linterfaccia SVGAnimatedPathData supporta gli elementi che hanno un attributo d che contiene i dati del percorso SVG e supporta la possibilità di animare tale attributo.
type: docs
weight: 2480
url: /it/net/aspose.svg.paths/isvganimatedpathdata/
---
## ISVGAnimatedPathData interface

L'interfaccia SVGAnimatedPathData supporta gli elementi che hanno un attributo 'd' che contiene i dati del percorso SVG e supporta la possibilità di animare tale attributo.

```csharp
public interface ISVGAnimatedPathData
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AnimatedPathSegList](../../aspose.svg.paths/isvganimatedpathdata/animatedpathseglist/) { get; } | Fornisce l'accesso ai contenuti animati correnti dell'attributo 'd' in una forma che corrisponde uno a uno con la sintassi di SVG. Se l'attributo o la proprietà specificata viene animata, contiene il valore animato corrente dell'attributo o della proprietà e sia l'oggetto stesso che il suo contenuto sono di sola lettura. Se l'attributo o la proprietà specificata non è attualmente animata, contiene lo stesso valore di pathSegList. |
| [PathSegList](../../aspose.svg.paths/isvganimatedpathdata/pathseglist/) { get; } | Fornisce l'accesso ai contenuti di base (cioè statici) dell'attributo 'd' in una forma che corrisponde uno a uno con la sintassi di SVG. Pertanto, se l'attributo 'd' ha un comando "absolute moveto (M)" e un comando "absolute arcto (A)", pathSegList avrà due voci: un SVG_PATHSEG_MOVETO_ABS e un SVG_PATHSEG_ARC_ABS. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Paths](../../aspose.svg.paths/)
* assemblea [Aspose.SVG](../../)


