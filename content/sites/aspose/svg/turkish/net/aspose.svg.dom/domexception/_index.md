---
title: DOMException
second_title: Aspose.SVG for .NET API Referansı
description: DOMException arabirimi bir yöntemi çağırmanın veya bir web APIsinin bir özelliğine erişmenin bir sonucu olarak ortaya çıkan anormal bir olayı istisna olarak adlandırılır temsil eder. Bu temel olarak web APIlerinde hata koşullarının nasıl açıklandığıdır.
type: docs
weight: 790
url: /tr/net/aspose.svg.dom/domexception/
---
## DOMException class

DOMException arabirimi, bir yöntemi çağırmanın veya bir web API'sinin bir özelliğine erişmenin bir sonucu olarak ortaya çıkan anormal bir olayı (istisna olarak adlandırılır) temsil eder. Bu, temel olarak web API'lerinde hata koşullarının nasıl açıklandığıdır.

```csharp
public class DOMException : PlatformException
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [DOMException](domexception#constructor)(string) | Yeni bir örneğini başlatır[`DOMException`](../domexception) sınıf. |
| [DOMException](domexception#constructor_1)(string, string) | Yeni bir örneğini başlatır[`DOMException`](../domexception) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Code](../../aspose.svg.dom/domexception/code) { get; } | Hata kodu sabitlerinden birini veya eşleşmezse 0 değerini içeren bir değer döndürür. Bu alan geçmiş nedenlerle kullanılmaktadır. |
| override [Message](../../aspose.svg.dom/domexception/message) { get; } | Verilen hata adıyla ilişkili bir mesajı veya açıklamayı temsil eden bir dize döndürür. |
| [Name](../../aspose.svg.dom/domexception/name) { get; } | Bir hata adıyla ilişkili dizelerden birini içeren bir dize döndürür. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [ABORT_ERR](../../aspose.svg.dom/domexception/abort_err) | İşlem iptal edildi. |
| const [DATA_CLONE_ERR](../../aspose.svg.dom/domexception/data_clone_err) | Nesne klonlanamaz. |
| const [DOMSTRING_SIZE_ERR](../../aspose.svg.dom/domexception/domstring_size_err) | Belirtilen metin aralığı bir DOMString'e uymuyorsa. |
| const [HIERARCHY_REQUEST_ERR](../../aspose.svg.dom/domexception/hierarchy_request_err) | Herhangi bir Düğüm, ait olmadığı bir yere eklenirse. |
| const [INDEX_SIZE_ERR](../../aspose.svg.dom/domexception/index_size_err) | Dizin veya boyut negatifse veya izin verilen değerden büyükse. |
| const [INUSE_ATTRIBUTE_ERR](../../aspose.svg.dom/domexception/inuse_attribute_err) | Halihazırda başka bir yerde kullanımda olan bir özniteliği ekleme girişiminde bulunulursa. |
| const [INVALID_ACCESS_ERR](../../aspose.svg.dom/domexception/invalid_access_err) | Bir parametre veya işlem, temel alınan nesne tarafından desteklenmiyorsa. |
| const [INVALID_CHARACTER_ERR](../../aspose.svg.dom/domexception/invalid_character_err) | XML adında olduğu gibi geçersiz veya geçersiz bir karakter belirtilirse. |
| const [INVALID_EXPRESSION_ERR](../../aspose.svg.dom/domexception/invalid_expression_err) | İfadede bir sözdizimi hatası var veya belirli XPathEvaluator kurallarına göre yasal bir ifade değil veya bu uygulama tarafından desteklenmeyen özel uzantı işlevleri veya değişkenler içeriyor. |
| const [INVALID_MODIFICATION_ERR](../../aspose.svg.dom/domexception/invalid_modification_err) | Temel nesnenin türünü değiştirme girişiminde bulunulursa. |
| const [INVALID_NODE_TYPE_ERR](../../aspose.svg.dom/domexception/invalid_node_type_err) | Sağlanan düğüm yanlış veya bu işlem için yanlış bir üst öğeye sahip. |
| const [INVALID_STATE_ERR](../../aspose.svg.dom/domexception/invalid_state_err) | Kullanılabilir olmayan veya artık kullanılmayan bir nesne kullanılmaya çalışılırsa. |
| const [NAMESPACE_ERR](../../aspose.svg.dom/domexception/namespace_err) | Ad alanları ile ilgili olarak yanlış bir şekilde bir nesne oluşturma veya değiştirme girişiminde bulunulursa. |
| const [NETWORK_ERR](../../aspose.svg.dom/domexception/network_err) | Bir ağ hatası oluştu. |
| const [NOT_FOUND_ERR](../../aspose.svg.dom/domexception/not_found_err) | Bir Düğüme, var olmadığı bir bağlamda başvurulmaya çalışılırsa. |
| const [NOT_SUPPORTED_ERR](../../aspose.svg.dom/domexception/not_supported_err) | Uygulama, istenen nesne veya işlem türünü desteklemiyorsa. |
| const [NO_DATA_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_data_allowed_err) | Verileri desteklemeyen bir Düğüm için veri belirtilmişse. |
| const [NO_MODIFICATION_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_modification_allowed_err) | Değişikliklere izin verilmeyen bir nesneyi değiştirme girişiminde bulunulursa. |
| const [QUOTA_EXCEEDED_ERR](../../aspose.svg.dom/domexception/quota_exceeded_err) | Kota aşıldı. |
| const [SECURITY_ERR](../../aspose.svg.dom/domexception/security_err) | İşlem güvenli değil. |
| const [SYNTAX_ERR](../../aspose.svg.dom/domexception/syntax_err) | Geçersiz veya geçersiz bir dize belirtilirse. |
| const [TIMEOUT_ERR](../../aspose.svg.dom/domexception/timeout_err) | İşlem zaman aşımına uğradı. |
| const [TYPE_ERR](../../aspose.svg.dom/domexception/type_err) | İfade, belirtilen türü döndürmek için dönüştürülemez. |
| const [TYPE_MISMATCH_ERR](../../aspose.svg.dom/domexception/type_mismatch_err) | Bir nesnenin türü, nesneyle ilişkilendirilen parametrenin beklenen türüyle uyumlu değilse. |
| const [URL_MISMATCH_ERR](../../aspose.svg.dom/domexception/url_mismatch_err) | Verilen URL başka bir URL ile eşleşmiyor. |
| const [VALIDATION_ERR](../../aspose.svg.dom/domexception/validation_err) | insertBefore veya removeChild gibi bir yönteme yapılan çağrı, Düğümü "kısmi geçerlilik" açısından geçersiz kılarsa, bu istisna ortaya çıkar ve işlem yapılmaz. Bu kod, [DOM Düzey 3 Doğrulama]'da kullanılır. Daha fazla bilgi için bu spesifikasyona bakın. |
| const [WRONG_DOCUMENT_ERR](../../aspose.svg.dom/domexception/wrong_document_err) | Bir Düğüm, onu oluşturandan farklı bir belgede kullanılıyorsa (bu onu desteklemez). |

### Ayrıca bakınız

* class [PlatformException](../../aspose.svg/platformexception)
* ad alanı [Aspose.Svg.Dom](../../aspose.svg.dom)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
