---
title: Interface ISVGAnimatedPathData
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Paths.ISVGAnimatedPathData arayüz. SVGAnimatedPathData arabirimi SVG yolu verilerini tutan d özniteliğine sahip öğeleri ve bu özniteliği canlandırma yeteneğini destekler.
type: docs
weight: 2480
url: /tr/net/aspose.svg.paths/isvganimatedpathdata/
---
## ISVGAnimatedPathData interface

SVGAnimatedPathData arabirimi, SVG yolu verilerini tutan 'd' özniteliğine sahip öğeleri ve bu özniteliği canlandırma yeteneğini destekler.

```csharp
public interface ISVGAnimatedPathData
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AnimatedPathSegList](../../aspose.svg.paths/isvganimatedpathdata/animatedpathseglist/) { get; } | SVG'nin sözdizimiyle bire bir eşleşen bir biçimde 'd' özniteliğinin geçerli animasyonlu içeriğine erişim sağlar. Belirtilen öznitelik veya özellik canlandırılıyorsa, öznitelik veya özelliğin geçerli animasyonlu değerini içerir ve hem nesnenin kendisi hem de içeriği salt okunurdur. Belirtilen öznitelik veya özellik şu anda canlandırılmıyorsa, pathSegList. ile aynı değeri içerir. |
| [PathSegList](../../aspose.svg.paths/isvganimatedpathdata/pathseglist/) { get; } | SVG'nin sözdizimiyle bire bir eşleşen bir biçimde 'd' özniteliğinin temel (yani statik) içeriğine erişim sağlar. Dolayısıyla, 'd' özniteliği bir "mutlak hareket (M)" ve bir "mutlak ark (A)" komutuna sahipse, pathSegList'in iki girişi olacaktır: bir SVG_PATHSEG_MOVETO_ABS ve bir SVG_PATHSEG_ARC_ABS. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Paths](../../aspose.svg.paths/)
* toplantı [Aspose.SVG](../../)


