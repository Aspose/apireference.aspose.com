---
title: "System ad alanı"
linktitle: "System"
second_title: "Aspose.Page için C++"
description: "C++'ta System ad alanını nasıl kullanılır."
type: docs
weight: 2100
url: /tr/cpp/system/
---



## Sınıflar

| Sınıf | Açıklama |
| --- | --- |
| [Activator](./activator/) | Nesne türleri oluşturmak için yöntemler içerir. |
| [Array](./array/) | Dizi veri yapısını temsil eden sınıf. Bu sınıfın nesneleri yalnızca [System::MakeArray()](./makearray/) ve [System::MakeObject()](./makeobject/) işlevleri kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [ArraySegment](./arraysegment/) | Tek boyutlu dizinin bir segmentini temsil eder. Bu tür yığına (stack) ayrılmalı ve işlevlere değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](./smartptr/) sınıfını asla kullanmayın. |
| [Attribute](./attribute/) | Özel öznitelikler için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [BitConverter](./bitconverter/) | Bayt dizisinin bir değer türüne ve tersine dönüşümünü gerçekleştiren yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın. |
| [Boolean](./boolean/) | [System.Boolean](./boolean/) .[Net](../system.net/) türünün statik üyelerini tutan sınıf. |
| [BoxedEnum](./boxedenum/) | Kutulanmış bir enum değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [BoxedValue](./boxedvalue/) | Kutulanmış bir değeri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [BoxedValueBase](./boxedvaluebase/) | Kutulanmış bir değeri temsil eden türev sınıfın bazı temel yöntemlerini tanımlayan ve uygulayan bir arayüz tanımlayan temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [Buffer](./buffer/) | Ham bayt dizilerini işleyen yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın. |
| [Byte](./byte/) | İşaretsiz 8-bit tamsayıyla çalışmak için yöntemler içerir. |
| [Char](./char/) | UTF-16 kod birimleri olarak temsil edilen karakterlerin işlenmesi için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın. |
| [Comparison](./comparison/) | Aynı türde iki nesneyi karşılaştıran yönteme bir işaretçiyi temsil eder. Bu tür yığına (stack) ayrılmalı ve işlevlere değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](./smartptr/) sınıfını asla kullanmayın. |
| [Console](./console/) | Verileri standart çıktı akışına göndermek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın. |
| [ConsoleOutput](./consoleoutput/) | Standart çıktı akışını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [DateTime](./datetime/) | Zaman continuumunda belirli bir tarih ve saat değerini temsil eder. Bu tür yığına (stack) ayrılmalı ve işlevlere değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](./smartptr/) sınıfını asla kullanmayın. |
| [DateTimeOffset](./datetimeoffset/) | Eşgüdümlü Evrensel Zaman'a (UTC) göre tarih ve günün saatini içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [DBNull](./dbnull/) | Var olmayan bir değeri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [Decimal](./decimal/) | Ondalık bir sayıyı temsil eder. Bu tür yığına (stack) ayrılmalı ve işlevlere değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](./smartptr/) sınıfını asla kullanmayın. |
| [DefaultBoxedValue](./defaultboxedvalue/) | [BoxedValue](./boxedvalue/) sınıf uygulaması. Ortak kodu çoğaltmadan BoxingValue özelleştirmelerinin ilan edilmesine izin verir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | Bir fonksiyon, yöntem ya da fonksiyon nesnesine işaretçiyi temsil eder. Bu tür yığına (stack) ayrılmalı ve işlevlere değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](./smartptr/) sınıfını asla kullanmayın. |
| [DynamicWeakPtr](./dynamicweakptr/) | Depolanan nesnenin şablon argümanlarının işaretçi modlarını izleyen ve her atamadan sonra güncelleyen akıllı işaretçi sınıfı. Bu tür, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığına (stack) ayrılmalı ve işlevlere değer olarak ya da const referansla geçirilmelidir. |
| [EnumValues](./enumvalues/) | **E** enum türünün sabitleri hakkında meta bilgi sağlar. |
| [EnumValuesBase](./enumvaluesbase/) | Enum türünün meta bilgisini temsil eden sınıf için temel sınıf. |
| [EventArgs](./eventargs/) | Bir olay tetiklendiğinde olay abonelerine geçirilen bağlamı temsil eden sınıflar için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin. |
| [ExceptionWrapper](./exceptionwrapper/) | Şablon, [Exception](./exception/) sınıfından türetilen istisnaların sarmalayıcısını temsil eder. |
| [FlagsAttribute](./flagsattribute/) | Bir sayımın bit alanı olarak ele alınabileceğini gösterir; yani, bir küme. |
| [Func](./func/) | Fonksiyon temsilcisi. Bu tip yığına (stack) tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipteki nesneleri yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [GC](./gc/) | Hiçbir şey yapmayan bir taslak gibi davranan taklit bir Çöp Toplama'yı temsil eder. Bu, örnek hizmeti olmayan statik bir tiptir. Herhangi bir yolla onun örneklerini asla oluşturmamalısınız. |
| [Guid](./guid/) | Küresel Benzersiz Tanımlayıcıyı (GUID) temsil eder. Bu tip yığına tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipteki nesneleri yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [IAsyncResult](./iasyncresult/) | Asenkron işlemin durumunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [ICloneable](./icloneable/) | Nesne kopyalama - bir nesnenin kopyasını oluşturma yeteneği sağlayan bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IComparable](./icomparable/) | İki nesneyi karşılaştıran bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IConvertible](./iconvertible/) | Uygulanan referans ya da değer tipinin değerini eşdeğer bir değere sahip ortak dil çalışma zamanı tipine dönüştüren yöntemleri tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [ICustomFormatter](./icustomformatter/) | Belirtilen nesne tarafından temsil edilen bir değerin dize temsili üzerinde özel biçimlendirme yapan bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IDisposable](./idisposable/) | Mevcut nesnenin sahip olduğu kaynakları serbest bırakan bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IEquatable](./iequatable/) | İki nesnenin eşitliğini belirleyen bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IFormatProvider](./iformatprovider/) | Biçimlendirme bilgisi sağlayan bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [IFormattable](./iformattable/) | Belirtilen biçim dizesi ve biçim sağlayıcıyı kullanarak mevcut nesnenin değerini biçimlendiren bir yöntemi tanımlar. |
| [Int16](./int16/) | 16-bit tamsayı ile çalışmak için yöntemler içerir. |
| [Int32](./int32/) | 32-bit tamsayı ile çalışmak için yöntemler içerir. |
| [Int64](./int64/) | 64-bit tamsayı ile çalışmak için yöntemler içerir. |
| [LockContext](./lockcontext/) | C# lock() ifadesini uygulayan koruma nesnesi. |
| [MarshalByRefObject](./marshalbyrefobject/) | Uzak nesne iletişimine (remoting) izin verilen uygulamalarda nesnelere uygulama alanı sınırları arasında erişim sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneklerini yığına ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | Temsilcilerin bir koleksiyonunu temsil eder. Bu tip yığına tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipteki nesneleri yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [Nullable](./nullable/) | İleri bildirim. |
| [NullableUtils](./nullableutils/) | C# [System.Nullable](./nullable/) (tip argümanı olmadan) statik sınıfını temsil eder. C++'ta sınıf şablonlarını aşırı yükleyemediği için özgün adı kullanmak mümkün değildir. Null atanabilen bir değer tipini destekler. Bu sınıf kalıtılamaz. |
| [Object](./object/) | [System.Object](./object/) sınıfı için C#'ta mevcut olan yöntemlerin kullanılmasını sağlayan temel sınıftır. Çevrilmiş ortamda kullanılan tüm önemsiz olmayan sınıflar bundan türemelidir. |
| [ObjectExt](./objectext/) | Nesne olmayan C++ tipleri (dizeler, sayılar vb.) için çağrılan C# [Object](./object/) yöntemlerini taklit eden statik yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir tiptir. Herhangi bir yolla onun örneklerini asla oluşturmamalısınız. |
| [ObjectType](./objecttype/) | Nesne tipi alıcılarını (getter) uygulayan statik yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir tiptir. Herhangi bir yolla onun örneklerini asla oluşturmamalısınız. |
| [OperatingSystem](./operatingsystem/) | Belirli bir işletim sistemini temsil eder ve onun hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Random](./random/) | Yarı rastgele bir sayı üreteci temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [ReadOnlySpan](./readonlyspan/) | [Span](./span/) sınıfı içinde kullanılmak üzere iletilir. |
| [ScopedCulture](./scopedculture/) | Kapsam içinde kullanılan bir kültürü temsil eder. |
| [SmartPtr](./smartptr/) | Yığıt (heap) üzerinde ayrılan tipleri sarmak için kullanılan işaretçi sınıfı. [Object](./object/) sınıfından türeten sınıfların belleğini yönetmek için kullanın. Bu işaretçi türü, içsel işaretçi (intrusive pointer) semantiğini izler. Referans sayacı ya [Object](./object/) içinde ya da [Object](./object/) örneğine sıkı bir şekilde bağlı bir sayaç yapısında tutulur. Her durumda, tüm [SmartPtr](./smartptr/) örnekleri, nasıl oluşturulduklarından bağımsız olarak tek bir sahiplik grubu oluşturur; bu, std::shared_ptr sınıfının davranışından farklıdır. Ham işaretçiyi [SmartPtr](./smartptr/)&#39;a dönüştürmek, aynı nesneye ortak referanslar tutan başka [SmartPtr](./smartptr/) örnekleri olduğu sürece güvenlidir. [SmartPtr](./smartptr/) sınıfı örneği iki durumdan birinde olabilir: paylaşımlı işaretçi ve zayıf işaretçi. Nesneyi canlı tutmak için paylaşımlı referans sayısının pozitif olması gerekir. Hem zayıf hem de paylaşımlı işaretçiler, işaret edilen nesneye (metot çağırmak, alanları okumak veya yazmak vb.) erişmek için kullanılabilir, ancak zayıf işaretçiler paylaşımlı işaretçi referans sayımına katılmaz. [Object](./object/), ona ait son 'paylaşımlı' [SmartPtr](./smartptr/) işaretçi yok edildiğinde silinir. Bu yüzden, nesne oluşturulurken veya yok edilirken başka paylaşımlı [SmartPtr](./smartptr/) işaretçi bulunmadığından emin olun. Bu sorunu düzeltmek için System::Object::ThisProtector koruma nesnelerini (C++ kodunda) veya CppCTORSelfReference ya da CppSelfReference özniteliğini (çevirilen C# kodunda) kullanın. Benzer şekilde, döngüsel referansları kırmak için [System::WeakPtr](./weakptr/) işaretçi sınıfını veya [System::SmartPtrMode::Weak](./smartptrmode/) işaretçi modunu (C++ kodunda) ya da CppWeakPtr özniteliğini (C# kodunda) kullanın. İki veya daha fazla nesne 'paylaşımlı' işaretçilerle birbirine referans verirse, hiç silinmezler. İşaretçi türü (zayıf veya paylaşımlı) çalışma zamanında değiştirilecekse, [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) metodunu veya [System::DynamicWeakPtr](./dynamicweakptr/) sınıfını kullanın. [SmartPtr](./smartptr/) sınıfı herhangi bir sanal metoda sahip değildir. Kendi bellek yönetim stratejinizi oluşturuyorsanız yalnızca bu sınıftan türetmelisiniz. Bu tip, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir. |
| [SmartPtrInfo](./smartptrinfo/) | Son tipini bilmeden [SmartPtr](./smartptr/)'in içeriğini test etmek ve değiştirmek için hizmet sınıfı. Çöp toplama ve döngüsel referans tespiti vb. için kullanılır. Bunu 'işaretçiden işaretçiye' olarak düşünün. [SmartPtr](./smartptr/)'in temel tipini kullanamıyoruz çünkü yok; bunun yerine bu 'info' sınıfını kullanıyoruz. |
| [Span](./span/) | C++20'nin std::span'ına benzer, keyfi bir belleğin kesintisiz bir bölgesini temsil eder. |
| [String](./string/) | [String](./string/) sınıfı kütüphane genelinde kullanılır. Kod çevirirken C# [System.String](./string/) yerine geçer. Optimizasyon nedenleriyle bir [Object](./object/) alt sınıfı olarak kabul edilmez. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [StringComparer](./stringcomparer/) | Farklı karşılaştırma modlarını kullanarak dizeleri karşılaştırır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [StringHashCompiletime](./stringhashcompiletime/) | c-dizisinden (c-string) bir hash değeri üreten yardımcı sınıf. |
| [TimeSpan](./timespan/) | Bir zaman aralığını temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [TimeZone](./timezone/) | Bir zaman dilimini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [TimeZoneInfo](./timezoneinfo/) | Belirli bir zaman dilimini tanımlayan bir bilgiyi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Tuple](./tuple/) | Bir demet (tuple) veri yapısını temsil eden sınıf. Azami öğe sayısı 8'tir. |
| [TupleFactory](./tuplefactory/) | Demet nesneleri oluşturmak için statik yöntemler sağlar. |
| [TypeInfo](./typeinfo/) | Belirli bir türü temsil eder ve onun hakkında bilgi sağlar. |
| [Uri](./uri/) | Birleşik kaynak tanımlayıcı (URI). Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [UriBuilder](./uribuilder/) | Evrensel kaynak tanımlayıcıları (URI'ler) oluşturmak ve değiştirmek için yöntemler sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [UriParser](./uriparser/) | Yeni bir URI şemasını ayrıştırmak için kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](./makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](./smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [UriShim](./urishim/) | Hizmet sınıfı. |
| [ValueTuple](./valuetuple/) | [ValueTuple](./valuetuple/) veri yapısını temsil eden sınıf. |
| [ValueType](./valuetype/) | [Object](./object/) kalıtımı performans nedenleriyle kısaltılmış değer tipleri için temel sınıf. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [Version](./version/) | Bir sürüm numarasını temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | [System::SmartPtr](./smartptr/) sınıfının, oluşturulurken kendisini zayıf (weak) moda ayarlayan alt sınıfı. Lütfen bu sınıfın örneğinin her zaman zayıf modda kalacağını garanti etmediğini, çünkü [set_Mode()](./smartptr/set_mode/) hâlâ erişilebilir olduğunu unutmayın. Bu tip, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir. |
| [WeakReference](./weakreference/) | Bir nesneyi referans alırken aynı zamanda o nesnenin silinmesine izin veren zayıf referansı temsil eder. |
| [WeakReference< T >](./weakreference_t_/) | Bir nesneyi referans alırken aynı zamanda o nesnenin silinmesine izin veren zayıf referansı temsil eder. |
| [WeakReference<>](./weakreference__/) | Bir nesneyi referans alırken aynı zamanda o nesnenin silinmesine izin veren zayıf referansı temsil eder. |
## Enums

| Enum | Açıklama |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | Farklı base-64 kodlu veri biçimlerini temsil eden değerleri içeren enum. |
| [DateTimeKind](./datetimekind/) | Tarih ve zaman türlerini temsil eden enum değerleri. |
| [DayOfWeek](./dayofweek/) | Haftanın gününü temsil eden enum. |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | Ortam değişkeninin konumunu belirtir. |
| [MidpointRounding](./midpointrounding/) | Yuvarlama işlevlerinin davranışını belirtir. |
| [PlatformID](./platformid/) | Bir işletim sistemi platformunu temsil eder. |
| [SmartPtrMode](./smartptrmode/) | [SmartPtr](./smartptr/) işaretçi türü: zayıf veya paylaşımlı. İşaretçinin nesneyi silme kararında sayılıp sayılmayacağını tanımlar. |
| [StringComparison](./stringcomparison/) | Dize karşılaştırma stilini tanımlar. |
| [StringSplitOptions](./stringsplitoptions/) | Dize bölme davranışını belirler. |
| [TypeCode](./typecode/) | Bir nesnenin tipini temsil eder. |
| [UriComponents](./uricomponents/) | URI bileşenlerini temsil eder. |
| [UriFormat](./uriformat/) | URI'nin nasıl kaçış (escape) edildiğini belirtir. |
| [UriHostNameType](./urihostnametype/) | Ana bilgisayar adının tipini temsil eder. |
| [UriKind](./urikind/) | URI türlerini temsil eder. |
| [UriPartial](./uripartial/) | [Uri.GetLeftPart](./uri/getleftpart/) yöntemi için bir URI'nin bölümlerini temsil eder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Action](./action/) | Geri dönüş değeri olmayan yöntemlere referans veren delege türü. |
| [ArrayPtr](./arrayptr/) | 'Diziye işaretçi' tipi için takma ad. |
| [AsyncCallback](./asynccallback/) | Asenkron işlem tamamlandığında çağrılacak yöntemi temsil eden bir delege türü. |
| [BadImageFormatException](./badimageformatexception/) | Dinamik bağlayıcı kitaplığı (DLL) veya çalıştırılabilir programın dosya görüntüsü geçersiz olduğunda atılan istisna. [BadImageFormatException](./badimageformatexception/) sınıfı örneklerini asla [System::SmartPtr](./smartptr/) içine sarmayın. |
| [ByteArrayPtr](./bytearrayptr/) | İmzalı olmayan 8-bit tamsayı dizisine işaret eden bir akıllı işaretçi nesnesi için takma ad. |
| [Converter](./converter/) | Çağrılabilir varlığa işaretçi temsil eder; bu varlık **TInput** tipinde tek bir argüman alır ve **TOutput** tipinde bir değer döndürür. |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/) sınıfının bir örneğine işaret eden bir akıllı işaretçi için takma ad. |
| [DecoderFallbackPtr](./decoderfallbackptr/) | [System::Text::DecoderFallback](../system.text/decoderfallback/) sınıfının bir örneğine işaret eden bir akıllı işaretçi için takma ad. |
| [DecoderPtr](./decoderptr/) | [System::Text::Decoder](../system.text/decoder/) sınıfının bir örneğine işaret eden bir akıllı işaretçi için takma ad. |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/) sınıfının bir örneğine işaret eden bir akıllı işaretçi için takma ad. |
| [DirectoryInfoPtr](./directoryinfoptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::DirectoryInfo](../system.io/directoryinfo/) sınıfının bir örneğine işaret eder. |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/) sınıfının bir örneğine işaret eder. |
| [EncoderFallbackPtr](./encoderfallbackptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::EncoderFallback](../system.text/encoderfallback/) sınıfının bir örneğine işaret eder. |
| [EncoderPtr](./encoderptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::Encoder](../system.text/encoder/) sınıfının bir örneğine işaret eder. |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/) sınıfının bir örneğine işaret eder. |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/) sınıfının bir örneğine işaret eder. |
| [EncodingInfoPtr](./encodinginfoptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::EncodingInfo](../system.text/encodinginfo/) sınıfının bir örneğine işaret eder. |
| [EncodingPtr](./encodingptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Text::Encoding](../system.text/encoding/) sınıfının bir örneğine işaret eder. |
| [Event](./event/) | Bir olayı temsil eder - abonelerin, ilgi duyulan bir olay gerçekleştiğinde bir temsilci çağrısı yoluyla bilgilendirildiği bir mekanizma. |
| [EventArgsPtr](./eventargsptr/) | Ortak işaretçi, [EventArgs](./eventargs/) sınıfının bir örneğine işaret eder. |
| [EventHandler](./eventhandler/) | Bir olaya tepki veren ve işleyen bir yöntemi temsil eder. Bu tür, yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tür nesneleri yönetmek için asla [System::SmartPtr](./smartptr/) sınıfını kullanmayın. |
| [Exception](./exception/) | Details::Exception yerine kullanılacak takma ad. |
| [ExceptionPtr](./exceptionptr/) | İstisna sarmalayıcıları tarafından kullanılan tür takma adı. |
| [FileInfoPtr](./fileinfoptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::FileInfo](../system.io/fileinfo/) sınıfının bir örneğine işaret eder. |
| [FileStreamPtr](./filestreamptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::FileStream](../system.io/filestream/) sınıfının bir örneğine işaret eder. |
| [FileSystemInfoPtr](./filesysteminfoptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::FileSystemInfo](../system.io/filesysteminfo/) sınıfının bir örneğine işaret eder. |
| [FunctionPtr](./functionptr/) | Varsayılan çağrı sözleşmesiyle fonksiyon tipi için bir takma ad. |
| [IAsyncResultPtr](./iasyncresultptr/) | [IAsyncResult](./iasyncresult/) için ortak işaretçi. |
| [IFormatProviderPtr](./iformatproviderptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IFormatProvider](./iformatprovider/) sınıfının bir örneğine işaret eder. |
| [MakeConstRef_t](./makeconstref_t/) | [MakeConstRef](./makeconstref/) değiştiricisi için yardımcı tip. |
| [MemoryStreamPtr](./memorystreamptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::MemoryStream](../system.io/memorystream/) sınıfının bir örneğine işaret eder. |
| [Predicate](./predicate/) | Bir koşul fonksiyonuna işaretçiyi temsil eder - tek bir argüman kabul eden ve bool değer döndüren çağrılabilir bir varlık. |
| [RTaskPtr](./rtaskptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/) sınıfının bir örneğine işaret eder. |
| [SharedPtr](./sharedptr/) | Kütüphanede yaygın olarak kullanılan akıllı işaretçi için takma ad. |
| [StreamPtr](./streamptr/) | Bir akıllı işaretçiye bir takma addır ve bu işaretçi, [System::IO::Stream](../system.io/stream/) sınıfının bir örneğine işaret eder. |
| [StreamReaderPtr](./streamreaderptr/) | Bir akıllı işaretçiye bir örnek işaret eden bir takma adı, [System::IO::StreamReader](../system.io/streamreader/) sınıfı için. |
| [StreamWriterPtr](./streamwriterptr/) | Bir akıllı işaretçiye bir örnek işaret eden bir takma adı, [System::IO::StreamWriter](../system.io/streamwriter/) sınıfı için. |
| [StringComparerPtr](./stringcomparerptr/) | Bir paylaşımlı işaretçiye bir örnek işaret eden bir takma adı, [StringComparer](./stringcomparer/) sınıfı için. |
| [TaskPtr](./taskptr/) | Bir akıllı işaretçiye bir örnek işaret eden bir takma adı, [System::Threading::Tasks::Task](../system.threading.tasks/task/) sınıfı için. |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | Paylaşımlı işaretçiye bir örnek işaret eden bir takma adı, [TimeZoneInfo](./timezoneinfo/) sınıfı için. |
| [TimeZonePtr](./timezoneptr/) | [TimeZone](./timezone/) sınıfının bir örneğine işaret eden paylaşımlı işaretçi. |
## Functions

| Fonksiyon | Açıklama |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ConstCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Discard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| dynamic_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Eşittir | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Eşittir< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Eşittir< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AçıkDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ZorlaStatikDönüştürme | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HerÜyeGVAdıİçin | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BüyükEşit | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Al | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Al | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Al | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Al | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| get_pointer | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KarmaKodAl | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KarmaKodAl | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KarmaKodAl | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KarmaKodAl | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KarmaKodAl | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Büyük | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| NesneyiBaşlat | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Mi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Mi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Mi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_parametrized_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_vp_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumMetaBilgiTanımlıMi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumMetaBilgiTanımlıMi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SonsuzMu | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| NaNMi | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| NegatifSonsuzMu | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PozitifSonsuzMu | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TupleMu | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÜzerindeDöngü | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| KüçükEşit | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Küçük | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DiziOluştur | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DiziOluştur | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DiziOluştur | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
