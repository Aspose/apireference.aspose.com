---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing ad alanı uzamsal referanslarla koordinat referans sistemleri çalışmak için sınıflar sağlar.
type: docs
weight: 370
url: /tr/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` ad alanı, uzamsal referanslarla (koordinat referans sistemleri) çalışmak için sınıflar sağlar.

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [Axis](./axis/) | Bir eksen, SRS'nin bir boyutunu tanımlar. |
| [BursaWolfParameters](./bursawolfparameters/) | Başka bir veriye dönüştürmek için Bursa-Kurt formülünün parametrelerini içeren sınıf. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | Bileşik SRS, hiçbiri bileşik olamayacak olan iki temel SRS'yi birleştirir. |
| [Ellipsoid](./ellipsoid/) | Elipsoid, dünyaya yaklaşan bir elipsoidi temsil eder. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geocentric SRS, dünyanın merkezinden başlayan 3 boyutlu kartezyen SRS'dir. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | Yer merkezli SRS oluşturmak için parametreler. Parametreler makul varsayılanlara sahiptir, bu nedenle yalnızca bazılarını atamanız gerekecektir. Eğer atarsanız`null` herhangi bir parametre için varsayılan bir değer kullanılacaktır. |
| [GeographicDatum](./geographicdatum/) | Coğrafi veri, dünyadaki belirli bir yerle enlem ve boylamı ilişkilendirir. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | Bir Coğrafi SRS, boylam ve enleme dayalı bir SRS'dir. Bir Coğrafi SRS, iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa, o zaman aslında iki boyutlu SRS ve dikey SRS'nin bileşik bir SRS'sidir. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | Coğrafi SRS oluşturmak için parametreler. Parametreler makul varsayılanlara sahiptir, bu nedenle yalnızca bazılarını atamanız gerekecektir. Eğer atarsanız`null` herhangi bir parametre için varsayılan bir değer kullanılacaktır. |
| [IdentifiableObject](./identifiableobject/) | EPSG kodu ve adı olabilecek bir nesneyi temsil eder. |
| [Identifier](./identifier/) | Bir tanımlayıcıyı temsil eder - bir nesnenin harici açıklamasına bir referans. WKT'den bir SRS oluşturursanız,[`Identifier`](../aspose.gis.spatialreferencing/identifier/) "AUTHORITY" anahtar sözcüğüne karşılık gelir. |
| [LocalDatum](./localdatum/) | Yerel uzamsal referans sisteminde ölçümler için kullanılan yöntemi gösterir. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | Yerel SRS ile ilgili bazı nesnelere koordinatlar, dünyaya değil. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian, boylamın 0. olarak tanımlandığı bir meridyeni temsil eder. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | Öngörülen SRS, coğrafi SRS'ye yapılan bir projeksiyon uygulamasının sonucudur. Bir yansıtılan SRS iki boyutlu veya üç boyutlu olabilir. Yansıtılan SRS üç boyutluysa, o zaman aslında iki boyutlu yansıtılan SRS ve bir boyutlu dikeyden oluşan bir bileşik SRS'dir. SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | Projeksiyonlu SRS oluşturmak için parametreler. Bazı parametrelerin varsayılanları vardır. Bazı parametrelerin makul varsayılanları vardır, bu nedenle yalnızca bunları atamanız gerekmez. Eğer atarsanız`null` bu parametreler için varsayılan bir değer kullanılacaktır. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) Ve[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) varsayılanlarınız yok - bazı olmayanları atamanız gerekir`null` bu özelliklere değer. |
| [Projection](./projection/) | (boylam, enlem)'i (x, y). 'ye dönüştüren parametrelere sahip bir projeksiyon yöntemini temsil eder. |
| [SpatialReferenceSystem](./spatialreferencesystem/) | Mekansal referans sistemi koordinatları Dünya üzerindeki yerlere eşler. Farklı SRS türleri vardır, bkz.[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . Ayrıca, SRS türü iseGeographic or Projected SRS bileşik veya tek olabilir, bkz.[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | Uzamsal referans sistemi dönüşümü, geometrileri kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürür. |
| [TransformationException](./transformationexception/) | Koordinat dönüşümü sırasında veya dönüşüm oluşturma sırasında hata oluştuğunda, dönüşüm istisnası atılır. |
| [Unit](./unit/) | Ölçü birimini temsil eder. |
| [VerticalDatum](./verticaldatum/) | Dikey ölçümler için kullanılan yöntemi gösterir. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | Dikey SRS, yükseklik koordinatlarını tanımlayan tek boyutlu bir SRS'dir. |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [AxisDirection](./axisdirection/) | Eksen yönü, eksenin işaret ettiği yönü tanımlar. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | Yer merkezli SRS. 'deki eksenlerin sırasını temsil eder |
| [GeographicAxisesOrder](./geographicaxisesorder/) | Coğrafi SRS'de eksen sırasını temsil eder. |
| [ParameterType](./parametertype/) | parametre türünü belirler[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | Coğrafi SRS'de eksen sırasını temsil eder. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | Uzamsal referans sisteminin türünü temsil eder. |


