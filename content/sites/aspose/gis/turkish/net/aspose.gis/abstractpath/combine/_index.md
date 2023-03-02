---
title: AbstractPath.Combine
second_title: Aspose.GIS for .NET API Referansı
description: AbstractPath yöntem. Bunu birleştirirAbstractPath belirtilen yol bileşenleriyle.
type: docs
weight: 50
url: /tr/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Bunu birleştirir[`AbstractPath`](../) belirtilen yol bileşenleriyle.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| location | String | Buna eklenecek bir yol bileşeni[`AbstractPath`](../). |

### Geri dönüş değeri

Yeni bir[`AbstractPath`](../) işaret eden[`Location`](../location/) bu, bunun konumlarının bir kombinasyonudur[`AbstractPath`](../)and bağımsız değişken.

### Notlar

Genellikle bu yöntem bir mirasçı tarafından geçersiz kılınmamalıdır. Varsayılan implementasyon bunu birleştirir[`Location`](../location/) argüman ile ve çağırır[`WithLocation`](../withlocation/) Argüman olarak birleştirilmiş dize ile yöntemi. Kombinasyon sonucu şu şekilde tanımlanır:  Argüman ile başlıyorsa[`Separator`](../separator/), kombinasyon sonucu bağımsız değişkene eşittir; Aksi takdirde, eğer[`Location`](../location/) ile biter[`Separator`](../separator/) , kombinasyon sonucu şuna eşittir:` +`; Aksi takdirde, sonuç şuna eşittir:` + +`

### Ayrıca bakınız

* class [AbstractPath](../)
* ad alanı [Aspose.Gis](../../abstractpath/)
* toplantı [Aspose.GIS](../../../)


