---
title: FileDriver.EditLayer
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Düzenleme için bir katman açar.
type: docs
weight: 70
url: /tr/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Düzenleme için bir katman açar.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Düzenleme için bir katman açar.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| NotSupportedException | Sürücü katmanları düzenleyemez. |
| IOException | Bir G/Ç hatası oluştu. |

### Notlar

Sürücü, tüm özellikleri içeren bir iç katman oluşturur. Ancak RAM yerine disk alanı kullanma seçeneğimiz var. Kaynakların daha optimum kullanımı için sürücüler var (sürücüyle ilgili belgelere bakın). Ayrıca sürücü, katmanları oluşturup açabiliyorsa bir katmanı düzenleyebilir.

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


