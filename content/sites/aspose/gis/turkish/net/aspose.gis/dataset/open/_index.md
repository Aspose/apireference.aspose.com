---
title: Dataset.Open
second_title: Aspose.GIS for .NET API Referansı
description: Dataset yöntem. Veri kümesini açar.
type: docs
weight: 20
url: /tr/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Veri kümesini açar.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Veri kümesinin yolu. |
| driver | FileDriver | Kullanılacak sürücü. |

### Geri dönüş değeri

bir örneği[`Dataset`](../).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Veri kümesini açar.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |
| driver | FileDriver | Kullanılacak sürücü. |

### Geri dönüş değeri

bir örneği[`Dataset`](../).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Veri kümesini açar.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Veri kümesinin yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Veri kümesini açar.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Veri kümesini açar.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| connection | IDbConnection | Veritabanı bağlantısı açıldı. |
| driver | DatabaseDriver | Kullanılacak sürücü. |

### Geri dönüş değeri

bir örneği[`Dataset`](../).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)


