---
title: AbstractPath.Open
second_title: Aspose.GIS for .NET API Referansı
description: AbstractPath yöntem. Bunu açarÖzetYoldosya olarak.
type: docs
weight: 120
url: /tr/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Bunu açar`ÖzetYol`dosya olarak.

```csharp
public abstract Stream Open(FileAccess access)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| access | FileAccess | üzerinde gerçekleştirilebilecek işlemlerin bir alt kümesini belirtir.Stream. |

### Geri dönüş değeri

AStream belirtilen ile açıldıFileAccess .

### Notlar

Eğer*access* bayrağa sahipWrite ayarlandı ve dosya mevcut değil, bir mirasçının onu oluşturması gerekir. bir`ÖzetYol` tarafından birden çok kez açılabilir.`Aspose.GIS` . Bu, bir file dosyasını birden çok akışla bağımsız olarak okumak için gereklidir. Sonucu önbelleğe almamalı, bunun yerine yeni döndürmelisinizStream her seferinde bu yöntem çağrılır.

### Ayrıca bakınız

* class [AbstractPath](../)
* ad alanı [Aspose.Gis](../../abstractpath/)
* toplantı [Aspose.GIS](../../../)


