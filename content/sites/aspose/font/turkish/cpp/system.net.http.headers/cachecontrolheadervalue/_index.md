---
title: "System::Net::Http::Headers::CacheControlHeaderValue sınıfı"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue sınıfı. ''Cache-Control'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 200
url: /tr/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


''Cache-Control'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Yeni bir örnek oluşturur. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Extensions](./get_extensions/)() | Cache-extension belirteçlerinin koleksiyonunu döndürür. |
| [get_MaxAge](./get_maxage/)() | İstemcinin bir yanıtı kabul edeceği süreyi belirleyen, saniye cinsinden maksimum yaş değerini alır. |
| [get_MaxStale](./get_maxstale/)() | İstemcinin süresi dolmuş yanıtları kabul edip etmeyeceğini belirleyen değeri alır. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | İstemcinin süresi dolmuş yanıtları kabul edeceği süreyi belirleyen değeri saniye cinsinden alır. |
| [get_MinFresh](./get_minfresh/)() | Tazelik ömrünü belirleyen değeri alır. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Sunucunun, önbellek girdisi bayat olduğunda yeniden doğrulama gerektirip gerektirmediğini belirleyen değeri alır. |
| [get_NoCache](./get_nocache/)() | RTTI bilgisi. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | 'Cache-Control' başlığındaki 'no-cache' yönergesindeki alan adları koleksiyonunu alır. |
| [get_NoStore](./get_nostore/)() | Bir önbelleğin HTTP isteğinin veya yanıtının herhangi bir bölümünü saklamaması gerektiğini belirleyen değeri alır. |
| [get_NoTransform](./get_notransform/)() | Bir önbelleğin veya proxy'nin varlık gövdesinin herhangi bir bölümünü değiştirmemesi gerektiğini belirleyen değeri alır. |
| [get_OnlyIfCached](./get_onlyifcached/)() | İstemcinin yalnızca önbelleğe alınmış girdileri kullanması gerekip gerekmediğini belirleyen değeri alır. |
| [get_Private](./get_private/)() | HTTP yanıt mesajının veya bir parçasının tek bir kullanıcı için tasarlandığını ve paylaşımlı bir önbellek tarafından önbelleğe alınmaması gerektiğini belirleyen değeri alır. |
| [get_PrivateHeaders](./get_privateheaders/)() | 'Cache-Control' başlığındaki 'private' yönergesindeki alan adları koleksiyonunu alır. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Sunucunun, paylaşımlı kullanıcı aracısı önbellekleri için önbellek girdisi bayat olduğunda yeniden doğrulama gerektirip gerektirmediğini belirleyen değeri alır. |
| [get_Public](./get_public/)() | Bir HTTP yanıtının herhangi bir önbellek tarafından önbelleğe alınabilir olup olmadığını belirleyen değeri alır. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Paylaşımlı bir önbellek için 'Cache-Control' başlığındaki 'max-age' yönergesini veya 'Expires' başlığını geçersiz kılan, saniye cinsinden paylaşımlı maksimum yaş değerini alır. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Belirtilen indeksden geçirilen bir dizeyi [CacheControlHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [Parse](./parse/)(String) | Geçirilen bir dizeyi [CacheControlHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | İstemcinin bir yanıtı kabul edeceği süreyi belirleyen, saniye cinsinden maksimum yaş değerini ayarlar. |
| [set_MaxStale](./set_maxstale/)(bool) | İstemcinin süresi dolmuş yanıtları kabul edip etmeyeceğini belirleyen değeri ayarlar. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | İstemcinin süresi dolmuş yanıtları kabul edeceği süreyi belirleyen, saniye cinsinden değeri ayarlar. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Tazelik ömrünü belirleyen değeri ayarlar. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Sunucunun, önbellek girdisi bayat olduğunda yeniden doğrulama gerektirip gerektirmediğini belirleyen değeri ayarlar. |
| [set_NoCache](./set_nocache/)(bool) | İstemcinin önbelleğe alınmış bir yanıtı kabul edip etmeyeceğini belirleyen değeri ayarlar. |
| [set_NoStore](./set_nostore/)(bool) | Bir önbelleğin HTTP isteğinin veya yanıtının herhangi bir bölümünü saklamaması gerektiğini belirleyen değeri ayarlar. |
| [set_NoTransform](./set_notransform/)(bool) | Bir önbelleğin veya proxy'nin varlık gövdesinin herhangi bir bölümünü değiştirmemesi gerektiğini belirleyen değeri ayarlar. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | İstemcinin yalnızca önbelleğe alınmış girdileri kullanması gerekip gerekmediğini belirleyen değeri ayarlar. |
| [set_Private](./set_private/)(bool) | HTTP yanıt mesajının veya bir parçasının tek bir kullanıcı için tasarlandığını ve paylaşımlı bir önbellek tarafından önbelleğe alınmaması gerektiğini belirleyen değeri ayarlar. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Sunucunun, paylaşımlı kullanıcı aracısı önbellekleri için önbellek girdisi bayat olduğunda yeniden doğrulama gerektirip gerektirmediğini belirleyen değeri ayarlar. |
| [set_Public](./set_public/)(bool) | Bir HTTP yanıtının herhangi bir önbellek tarafından önbelleğe alınabilir olup olmadığını belirleyen değeri ayarlar. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Paylaşılan önbellek için 'Cache-Control' başlığındaki 'max-age' yönergesini veya 'Expires' başlığını geçersiz kılan, saniye cinsinden ortak maksimum yaş değerini ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Geçilen bir dizeyi [CacheControlHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
