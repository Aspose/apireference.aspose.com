---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing ad alanı uzamsal referanslarla çalışmak için sınıflar sağlar koordinat referans sistemleri.
type: docs
weight: 330
url: /tr/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` ad alanı, uzamsal referanslarla çalışmak için sınıflar sağlar (koordinat referans sistemleri).

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [Axis](./axis) | Bir eksen, SRS'nin bir boyutunu tanımlar. |
| [BursaWolfParameters](./bursawolfparameters) | Başka bir veriye dönüştürmek için Bursa-Kurt formülünün parametrelerini içeren sınıf. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Bileşik SRS, hiçbiri bileşik olamayan iki temel SRS'yi birleştirir. |
| [Ellipsoid](./ellipsoid) | Elipsoid, dünyaya yaklaşan bir elipsoidi temsil eder. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Geocentric SRS, orijini dünya merkezinde olan 3 boyutlu kartezyen SRS'dir. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Yer merkezli SRS oluşturmak için parametreler. Parametrelerin makul varsayılanları vardır, bu nedenle bunlardan yalnızca bazılarını atamanız gerekir. `null` herhangi bir parametre için varsayılan bir değer kullanılacaktır. |
| [GeographicDatum](./geographicdatum) | Coğrafi veri, dünyadaki belirli bir yerle enlem ve boylam arasında ilişki kurar. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Coğrafi SRS, boylam ve enlemi temel alan bir SRS'dir. Bir Coğrafi SRS, iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa, aslında iki boyutlu SRS ve dikey SRS'nin bir bileşik SRS'sidir. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Coğrafi SRS oluşturmak için parametreler. Parametrelerin makul varsayılanları vardır, bu nedenle bunlardan yalnızca bazılarını atamanız gerekir. `null` herhangi bir parametre için varsayılan bir değer kullanılacaktır. |
| [IdentifiableObject](./identifiableobject) | EPSG koduna ve adına sahip olabilecek bir nesneyi temsil eder. |
| [Identifier](./identifier) | Bir tanımlayıcıyı temsil eder - bir nesnenin harici açıklamasına bir başvuru. WKT'den bir SRS oluşturursanız,[`Identifier`](../aspose.gis.spatialreferencing/identifier) "AUTHORITY" anahtar kelimesine karşılık gelir. |
| [LocalDatum](./localdatum) | Yerel uzamsal referans sistemindeki ölçümler için kullanılan yöntemi gösterir. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Bazı nesnelerle ilgili yerel SRS ile ilgili koordinatlar, toprakla değil. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian, boylamın 0. olarak tanımlandığı bir meridyeni temsil eder. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Öngörülen SRS, coğrafi SRS'ye bir izdüşüm uygulamasının bir sonucudur. Öngörülen bir SRS, iki boyutlu veya üç boyutlu olabilir. Öngörülen SRS üç boyutluysa, aslında iki boyutlu yansıtılan SRS ve bir boyutlu dikeyden oluşan bir bileşik SRS'dir. SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Öngörülen SRS oluşturmak için parametreler. Bazı parametrelerin varsayılanları vardır. Bazı parametrelerin makul varsayılanları vardır, bu nedenle yalnızca bunları atamanız gerekmez. `null` bu parametreler için varsayılan bir değer kullanılacaktır. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) ve[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) varsayılanlarınız yok - bazı olmayanlar atamanız gerekiyor`null` bu özelliklere değer. |
| [Projection](./projection) | (Boylam, enlem)'i (x, y)'ye dönüştüren parametrelere sahip bir projeksiyon yöntemini temsil eder. |
| [SpatialReferenceSystem](./spatialreferencesystem) | Uzamsal referans sistemi, koordinatları Dünya üzerindeki yerlere eşler. Farklı SRS türleri vardır, bkz.[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . Dahası, eğer SRS tipi iseGeographic or Projected SRS bileşik veya tek olabilir, bkz.[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | Uzamsal referans sistemi dönüşümü, geometrileri kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürür. |
| [TransformationException](./transformationexception) | Koordinat dönüştürme veya dönüştürme oluşturma sırasında hata oluştuğunda dönüştürme istisnası atılır. |
| [Unit](./unit) | Ölçü birimini temsil eder. |
| [VerticalDatum](./verticaldatum) | Dikey ölçümler için kullanılan yöntemi gösterir. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Dikey SRS, yükseklik koordinatlarını tanımlayan tek boyutlu bir SRS'dir. |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [AxisDirection](./axisdirection) | Eksen yönü, eksenin işaret ettiği yönü tanımlar. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Yer merkezli SRS'de eksenlerin sırasını temsil eder. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Coğrafi SRS'deki eksen sırasını temsil eder. |
| [ParameterType](./parametertype) | İçindeki parametrenin türünü belirler[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Coğrafi SRS'deki eksen sırasını temsil eder. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Uzamsal başvuru sisteminin türünü temsil eder. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
