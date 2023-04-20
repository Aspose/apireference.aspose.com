---
title: Interface IWindow
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Window.IWindow arayüz. Pencere nesnesi bir DOM belgesi içeren bir pencereyi temsil eder.
type: docs
weight: 3820
url: /tr/net/aspose.svg.window/iwindow/
---
## IWindow interface

Pencere nesnesi, bir DOM belgesi içeren bir pencereyi temsil eder.

```csharp
public interface IWindow : IDisposable, IDocumentView, IEventTarget, IGlobalEventHandlers, 
    IWindowEventHandlers, IWindowTimers
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Document](../../aspose.svg.window/iwindow/document/) { get; } | Document özniteliği, Window nesnesinin en yeni Document nesnesini döndürmelidir. |
| [FrameElement](../../aspose.svg.window/iwindow/frameelement/) { get; } | Bir Belgenin frameElement nesnesi. |
| [Location](../../aspose.svg.window/iwindow/location/) { get; } | Pencere arayüzünün konum özniteliği, o Pencere nesnesinin Document. için Konum nesnesini döndürmelidir. |
| [Name](../../aspose.svg.window/iwindow/name/) { get; set; } | Window nesnesinin name özniteliği, alınırken tarama içeriğinin geçerli adını döndürmeli ve ayarlandığında, tarama içeriğinin adını yeni değere ayarlamalıdır. |
| [Opener](../../aspose.svg.window/iwindow/opener/) { get; } | Window nesnesindeki açıcı IDL özniteliği, alınırken, mevcut gözatma bağlamının oluşturulduğu gözatma bağlamının (açıcı gözatma bağlamı) WindowProxy nesnesini, eğer varsa, hala mevcutsa ve varsa döndürmelidir. mevcut göz atma bağlamı, açıcısını reddetmedi; aksi halde null döndürmelidir. Ayarlama sırasında, yeni değer null ise, geçerli göz atma bağlamı açıcısını reddetmelidir; yeni değer başka bir şeyse, kullanıcı aracısı, özellik anahtarı olarak "opener" özellik adını ve Özellik Tanımlayıcı { [[Değer]] değerini ileterek Window nesnesinin [[DefineOwnProperty]] dahili yöntemini çağırmalıdır. , [[Yazılabilir]]: true, [[Enumerable]]: true, [[Configurable]]: true } özelliği tanımlayıcı olarak, burada değer yeni değerdir. |
| [Parent](../../aspose.svg.window/iwindow/parent/) { get; } | Gözatma bağlamında b bir Belgenin Window nesnesindeki üst IDL özniteliği, varsa üst gözatma bağlamının WindowProxy nesnesini (yani, b bir alt gözatma bağlamıysa) veya gözatmanın WindowProxy nesnesini döndürmelidir. bağlam b'nin kendisi, aksi takdirde (yani, üst düzey bir göz atma bağlamı veya ayrılmış, iç içe geçmiş bir göz atma bağlamıysa). |
| [Self](../../aspose.svg.window/iwindow/self/) { get; } | Window nesnesinin tarama içeriğinin WindowProxy nesnesini döndürür. |
| [Top](../../aspose.svg.window/iwindow/top/) { get; } | Tarama bağlamındaki bir Belgenin Window nesnesindeki üst IDL özniteliği b, üst düzey tarama bağlamının WindowProxy nesnesini döndürmelidir (bu, kendisi bir üst düzey tarama bağlamı olsaydı kendi WindowProxy nesnesi olurdu), eğer bir veya kendi WindowProxy nesnesine sahiptir (örneğin, ayrılmış, iç içe geçmiş bir tarama bağlamıysa). |
| [Window](../../aspose.svg.window/iwindow/window/) { get; } | Window nesnesinin tarama içeriğinin WindowProxy nesnesini döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Alert](../../aspose.svg.window/iwindow/alert/)(string) | Verilen mesajla birlikte kalıcı bir uyarı görüntüler ve kullanıcının bunu kapatmasını bekler |
| [Confirm](../../aspose.svg.window/iwindow/confirm/)(string) | Verilen mesajla birlikte kalıcı bir Tamam/İptal istemi görüntüler, kullanıcının bunu reddetmesini bekler ve kullanıcı Tamam'ı tıklarsa doğru, kullanıcı İptal'i tıklarsa yanlış döndürür. |
| [Prompt](../../aspose.svg.window/iwindow/prompt/)(string, string) | Verilen mesajla birlikte kalıcı bir metin alanı istemi görüntüler, kullanıcının mesajı kapatmasını bekler ve kullanıcının girdiği değeri döndürür. Kullanıcı istemi iptal ederse, bunun yerine null değerini döndürür. İkinci bağımsız değişken mevcutsa, verilen değer varsayılan olarak kullanılır. |

### Ayrıca bakınız

* interface [IDocumentView](../../aspose.svg.dom.views/idocumentview/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* interface [IGlobalEventHandlers](../../aspose.svg.dom/iglobaleventhandlers/)
* interface [IWindowEventHandlers](../iwindoweventhandlers/)
* interface [IWindowTimers](../iwindowtimers/)
* ad alanı [Aspose.Svg.Window](../../aspose.svg.window/)
* toplantı [Aspose.SVG](../../)


