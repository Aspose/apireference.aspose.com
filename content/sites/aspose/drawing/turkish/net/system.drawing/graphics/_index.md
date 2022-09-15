---
title: Graphics
second_title: Aspose.Drawing for .NET API Referansı
description: Çizim yüzeyini içine alır.
type: docs
weight: 530
url: /tr/net/system.drawing/graphics/
---
## Graphics class

Çizim yüzeyini içine alır.

```csharp
public class Graphics : IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | Alır veya ayarlarRegion bunun çizim bölgesini sınırlayanGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | [`RectangleF`](../rectanglef) bunun kırpma bölgesini sınırlayan yapı[`Graphics`](../graphics) . |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | Birleştirilmiş görüntülerin buna nasıl çizileceğini belirten bir değer alır veya ayarlarGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | Buna çizilen birleştirilmiş görüntülerin işleme kalitesini alır veya ayarlarGraphics . |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | Bunun yatay çözünürlüğünü alırGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | Bunun dikey çözünürlüğünü alırGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | Bu Grafikle ilişkili enterpolasyon modunu alır veya ayarlar. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | Bunun kırpma bölgesinin olup olmadığını gösteren bir değer alır.Graphics boş. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | Bunun görünür kırpma bölgesinin olup olmadığını gösteren bir değer alır.Graphics boş. |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | Bunun için dünya birimleri ve sayfa birimleri arasındaki ölçeği alır veya ayarlarGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | Bu sayfa koordinatları için kullanılan ölçü birimini alır veya ayarlar.Graphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | Bunun oluşturulması sırasında piksellerin nasıl dengeleneceğini belirten bir değer alır veya ayarlarGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | Bunun oluşturma kaynağını alır veya ayarlarGraphics renk taklidi ve tarama fırçaları için. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | Bu Grafik için işleme kalitesini alır veya ayarlar. |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | Metin işleme için gama düzeltme değerini alır veya ayarlar. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | Bununla ilişkili metin için oluşturma modunu alır veya ayarlarGraphics . |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | Bunun için geometrik dünya dönüşümünün bir kopyasını alır veya ayarlarGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | Bunun görünür kırpma bölgesinin sınırlayıcı dikdörtgenini alırGraphics . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | Yeni birGraphics belirtilen tanıtıcıdan bir pencereye. |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | Belirtilen Görüntüden yeni bir Grafik oluşturur. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | Geçerli olana bir yorum eklerMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | Bunun geçerli durumuyla bir grafik kapsayıcısını kaydederGraphics ve yeni bir grafik kapsayıcısı açar ve kullanır. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | Bunun geçerli durumuyla bir grafik kapsayıcısını kaydederGraphics ve belirtilen ölçek dönüşümüne sahip yeni bir grafik kapsayıcısını açar ve kullanır. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | Bunun geçerli durumuyla bir grafik kapsayıcısını kaydederGraphics ve belirtilen ölçek dönüşümüne sahip yeni bir grafik kapsayıcısını açar ve kullanır. |
| [Clear](../../system.drawing/graphics/clear)(Color) | Tüm çizim yüzeyini temizler ve belirtilen arka plan rengiyle doldurur. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | Ekrandan çizim yüzeyine bir piksel dikdörtgenine karşılık gelen renk verilerinin bit blok aktarımını gerçekleştirir.Graphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | Ekrandan çizim yüzeyine bir piksel dikdörtgenine karşılık gelen renk verilerinin bit blok aktarımını gerçekleştirir.Graphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | Bir piksel dikdörtgenine karşılık gelen renk verilerinin ekrandan çizim yüzeyine bit blok aktarımını gerçekleştirir.Graphics . |
| [Dispose](../../system.drawing/graphics/dispose)() | Bu Grafik tarafından kullanılan tüm kaynakları serbest bırakır. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | Bir RectangleF yapısı tarafından belirtilen bir elipsin bir bölümünü temsil eden bir yay çizer. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | Bir çift koordinat, genişlik ve yükseklik ile belirtilen bir elipsin bir bölümünü temsil eden bir yay çizer. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | Dört PointF yapısı tarafından tanımlanan bir Bézier spline çizer. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | Noktaları temsil eden sıralı dört koordinat çifti tarafından tanımlanan bir Bézier spline çizer. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | Bir diziden bir dizi Bézier spline çizer.Point yapılar. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | Bir diziden bir dizi Bézier spline çizer.PointF yapılar. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | Bir dizi tarafından tanımlanan kapalı bir ana eğri çizerPointF yapılar. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | Bir dizi tarafından tanımlanan kapalı bir ana eğri çizerPoint yapılar. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | Belirtilen bir gerilimi kullanarak bir dizi PointF yapısı tarafından tanımlanan kapalı bir ana eğri çizer. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | Bir dizi tarafından tanımlanan kapalı bir ana eğri çizerPoint belirli bir gerilimi kullanan yapılar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.PointF yapılar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.Point yapılar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.PointF belirli bir gerilimi kullanan yapılar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.Point belirli bir gerilimi kullanan yapılar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.PointF Belirli bir gerilim kullanan yapılar. Çizim, dizinin başından itibaren ofset ile başlar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.PointF Belirli bir gerilim kullanan yapılar. Çizim, dizinin başından itibaren ofset ile başlar. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | Belirtilen bir dizi aracılığıyla bir ana eğri çizgi çizer.Point Belirli bir gerilim kullanan yapılar. Çizim, dizinin başından itibaren ofset ile başlar. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | Sınırlayıcı bir RectangleF. tarafından tanımlanan bir elips çizer |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | Bir koordinat çifti, bir yükseklik ve bir genişlik ile belirtilen sınırlayıcı bir dikdörtgen tarafından tanımlanan bir elips çizer. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | Belirtilen ile temsil edilen resmi çizer.Icon tarafından belirtilen alan içindeRectangle yapı. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | Belirtilen ile temsil edilen resmi çizer.Icon belirtilen koordinatlarda. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | Belirtilen ile temsil edilen resmi çizer.Icon görüntüyü ölçeklendirmeden. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | Belirtilen Resmi orijinal fiziksel boyutunu kullanarak belirtilen konumda çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | Belirtilen çizerImage , belirtilen konumda orijinal fiziksel boyutunu kullanarak. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | Belirtilen çizerImage belirtilen konumda ve belirtilen şekil ve boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | Belirtilen çizerЕ:Image belirtilen konumda ve belirtilen şekil ve boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | Belirtilen Görüntüyü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | Belirtilen Görüntüyü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | Belirtilen çizerImage , belirtilen konumda orijinal fiziksel boyutunu kullanarak. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | Bir koordinat çifti tarafından belirtilen konumda orijinal fiziksel boyutunu kullanarak belirtilen görüntüyü çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | Belirtilen Görüntünün belirtilen bölümünü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | Belirtilenin belirtilen kısmını çizerImage belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | Belirtilen Görüntünün belirtilen bölümünü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | Belirtilen Görüntünün belirtilen bölümünü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | Belirtilen çizerImage , orijinal fiziksel boyutunu kullanarak, belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | Belirtilen konumda bir görüntünün bir bölümünü çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | Belirtilen Görüntüyü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | Belirtilen konumda bir görüntünün bir bölümünü çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | Belirtilen Görüntünün belirtilen bölümünü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | Belirtilenin belirtilen kısmını çizerImage belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | Belirtilenin belirtilen kısmını çizerImage belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | Belirtilenin belirtilen kısmını çizerImage belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | Belirtilenin belirtilen kısmını çizerImage belirtilen konumda ve belirtilen boyutta. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | Belirtilen Görüntünün belirtilen bölümünü belirtilen konumda ve belirtilen boyutta çizer. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | Belirtilen bir konumda orijinal fiziksel boyutunu kullanarak belirli bir görüntü çizer. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | Belirtilen bir konumda orijinal fiziksel boyutunu kullanarak belirli bir görüntü çizer. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | Bir koordinat çifti tarafından belirtilen konumda orijinal fiziksel boyutunu kullanarak belirtilen görüntüyü çizer. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | Bir koordinat çifti tarafından belirtilen konumda orijinal fiziksel boyutunu kullanarak belirtilen görüntüyü çizer. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | Belirtilen görüntüyü ölçeklendirmeden çizer ve gerekirse belirtilen dikdörtgene sığdırmak için keser. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | İkiyi birbirine bağlayan bir çizgi çizerPoint yapılar. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | İki PointF yapısını birbirine bağlayan bir çizgi çizer. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | Koordinat çiftleri tarafından belirtilen iki noktayı birleştiren bir çizgi çizer. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | Koordinat çiftleri tarafından belirtilen iki noktayı birleştiren bir çizgi çizer. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | Bir diziyi birbirine bağlayan bir dizi çizgi parçası çizer.PointF yapılar. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | Bir diziyi birbirine bağlayan bir dizi çizgi parçası çizer.Point yapılar. |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | Bir GraphicsPath çizer. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | Bir RectangleF yapısı ve iki radyal çizgi tarafından belirtilen bir elips tarafından tanımlanan bir pasta şekli çizer. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | Bir koordinat çifti, genişlik, yükseklik ve iki radyal çizgi ile belirtilen bir elips tarafından tanımlanan bir pasta şekli çizer. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | Bir dizi PointF yapısı tarafından tanımlanan bir çokgen çizer. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | Bir dizi tarafından tanımlanan bir çokgen çizerPoint yapılar. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | Bir Rectangle yapısı tarafından belirtilen bir dikdörtgen çizer. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | Koordinat çifti, genişlik ve yükseklik ile belirtilen bir dikdörtgen çizer. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | Koordinat çifti, genişlik ve yükseklik ile belirtilen bir dikdörtgen çizer. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | tarafından belirtilen bir dizi dikdörtgen çizerRectangleF yapılar. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | tarafından belirtilen bir dizi dikdörtgen çizerRectangle yapılar. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | Belirtilen metin dizesini belirtilen konumda belirtilenBrush veFont nesneler. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | Belirtilen metin dizesini belirtilen dikdörtgen içinde belirtilenBrush veFont belirtilen biçimlendirme özniteliklerini kullanan nesnelerStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | Belirtilen metin dizesini belirtilen konumda belirtilenBrush veFont nesneler. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | Belirtilen metin dizesini belirtilen konumda belirtilenBrush and Font belirtilen biçimlendirme özniteliklerini kullanan nesnelerStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | Belirtilen metin dizesini belirtilen dikdörtgen içinde belirtilenBrush veFont belirtilen biçimlendirme özniteliklerini kullanan nesnelerStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | Belirtilen metin dizesini belirtilen konumda belirtilenBrush and Font belirtilen biçimlendirme özniteliklerini kullanan nesnelerStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | Geçerli grafik kapsayıcısını kapatır ve bunun durumunu geri yüklerGraphics bir çağrı ile kaydedilen durumaBeginContainer yöntem. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada belirtilen görüntü özniteliklerini kullanarak görüntülemek için bir geri arama method için birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | Bir S'den seçilen bir dikdörtgendeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | Bunun klip bölgesini güncellerGraphics tarafından belirtilen alanı hariç tutmak içinRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | Bunun klip bölgesini güncellerGraphics tarafından belirtilen alanı hariç tutmak içinRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | Bir dizi tarafından tanımlanan kapalı bir ana eğri eğrisinin içini doldururPointF yapılar. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | Bir dizi tarafından tanımlanan kapalı bir ana eğri eğrisinin içini doldururPoint yapılar. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | Bir dizi tarafından tanımlanan kapalı bir ana eğri eğrisinin içini doldururPointF belirtilen doldurma modunu kullanan yapılar. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | Bir dizi tarafından tanımlanan kapalı bir ana eğri eğrisinin içini doldururPoint belirtilen doldurma modunu kullanan yapılar. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | Belirtilen doldurma modunu ve gerilimi kullanarak bir dizi PointF yapısı tarafından tanımlanan kapalı bir ana spline eğrisinin içini doldurur . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | Bir dizi tarafından tanımlanan kapalı bir ana eğri eğrisinin içini doldururPoint belirtilen doldurma modunu kullanan yapılar. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | Bir RectangleF yapısı tarafından belirtilen sınırlayıcı bir dikdörtgen tarafından tanımlanan bir elipsin içini doldurur. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | Bir koordinat çifti, bir genişlik ve bir yükseklik tarafından belirtilen sınırlayıcı bir dikdörtgen tarafından tanımlanan bir elipsin içini doldurur. |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | GraphicsPath'in içini doldurur. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | Dikdörtgen yapısı ve iki radyal çizgi tarafından belirtilen bir elips tarafından tanımlanan pasta bölümünün içini doldurur. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | Bir çift koordinat, genişlik, yükseklik ve iki radyal çizgi ile belirtilen bir elips tarafından tanımlanan pasta bölümünün içini doldurur. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | Bir çift koordinat, genişlik, yükseklik ve iki radyal çizgi ile belirtilen bir elips tarafından tanımlanan pasta bölümünün içini doldurur. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | tarafından belirtilen bir dizi nokta tarafından tanımlanan bir çokgenin içini doldurur.PointF yapılar. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | tarafından belirtilen bir dizi nokta tarafından tanımlanan bir çokgenin içini doldurur.Point yapılar. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | Belirtilen doldurma modunu kullanarak PointF yapıları tarafından belirtilen bir dizi nokta tarafından tanımlanan bir çokgenin içini doldurur. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | tarafından belirtilen bir dizi nokta tarafından tanımlanan bir çokgenin içini doldurur.Point belirtilen doldurma modunu kullanan yapılar. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | Bir RectangleF yapısı tarafından belirtilen bir dikdörtgenin içini doldurur. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | Bir çift koordinat, genişlik ve yükseklik ile belirtilen bir dikdörtgenin içini doldurur. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | ile belirtilen bir dizi dikdörtgenin içini doldurur.RectangleF yapılar. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | ile belirtilen bir dizi dikdörtgenin içini doldurur.Rectangle yapılar. |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | Bir Bölgenin içini doldurur. |
| [Flush](../../system.drawing/graphics/flush#flush)() | Bekleyen tüm grafik işlemlerinin yürütülmesini zorlar ve işlemlerin bitmesini beklemeden hemen geri döner. |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | Bekleyen tüm grafik işlemlerinin, belirtilen şekilde işlemler bitmeden önce geri dönmeyi bekleyen veya beklemeyen yöntemle yürütülmesini zorlar. |
| [GetHdc](../../system.drawing/graphics/gethdc)() | Bununla ilişkili aygıt bağlamının tanıtıcısını alırGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | Belirtilen renge en yakın rengi alırColor yapı. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | Bunun klip bölgesini güncellerGraphics geçerli klip bölgesinin kesişimine ve belirtilenRectangle yapı. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | Bunun klip bölgesini güncellerGraphics geçerli klip bölgesinin kesişimine ve belirtilenRectangleF yapı. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | Bunun klip bölgesini güncellerGraphics geçerli klip bölgesinin kesişimine ve belirtilenRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | BelirtilenPoint yapı, bunun görünür klip bölgesi içinde yer alır.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | BelirtilenPointF yapı, bunun görünür klip bölgesi içinde yer alır.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | Bir tarafından belirtilen dikdörtgeninRectangle yapı, bunun görünür klip bölgesi içinde yer alır.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | Bir tarafından belirtilen dikdörtgeninRectangleF yapı, bunun görünür klip bölgesi içinde yer alır.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | Bir koordinat çifti tarafından belirtilen noktanın, bunun görünür klip bölgesi içinde olup olmadığını gösterir.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | Bir koordinat çifti tarafından belirtilen noktanın, bunun görünür klip bölgesi içinde olup olmadığını gösterir.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | Bir koordinat çifti, bir genişlik ve bir yükseklik tarafından belirtilen dikdörtgenin, bunun görünür klip bölgesinde içerilip içerilmeyeceğini gösterir.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | Bir koordinat çifti, bir genişlik ve bir yükseklik tarafından belirtilen dikdörtgenin, bunun görünür klip bölgesinde içerilip içerilmeyeceğini gösterir.Graphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | Bir dizi alırRegion her biri belirtilen dize içinde bir dizi karakter konumunu sınırlayan nesneler. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont ve belirtilen ile biçimlendirilmiş StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont ve belirtilen ile biçimlendirilmiş StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont ve belirtilen ile biçimlendirilmiş StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | Belirtilen dizeyle çizildiğinde belirtilen dizeyi ölçerFont ve belirtilen ile biçimlendirilmiş StringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | Bunun dünya dönüşümünü çarparGraphics ve belirtilenMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Bunun dünya dönüşümünü çarparGraphics ve belirtilen Matrix belirtilen sırada. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | Bir önceki çağrısıyla elde edilen bir aygıt bağlam tanıtıcısını serbest bırakır.GetHdc bunun yöntemiGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | Bir önceki çağrıyla elde edilen bir aygıt bağlam tanıtıcısını serbest bırakır.GetHdc Bunun method Graphics . |
| [ResetClip](../../system.drawing/graphics/resetclip)() | Bunun klip bölgesini sıfırlarGraphics sonsuz bir bölgeye. |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | Bunun dünya dönüşüm matrisini sıfırlarGraphics kimlik matrisine. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | Bunun durumunu geri yükler[`Graphics`](../graphics) tarafından temsil edilen devlete[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | Belirtilen döndürmeyi bunun dönüştürme matrisine uygular.Graphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Belirtilen döndürmeyi bunun dönüştürme matrisine uygular.Graphics belirtilen sırada. |
| [Save](../../system.drawing/graphics/save)() | Bunun mevcut durumunu kaydeder[`Graphics`](../graphics) ve kaydedilen durumu bir ile tanımlar[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | Belirtilen ölçekleme işlemini bunun dönüştürme matrisine uygular.Graphics it öğesini nesnenin dönüştürme matrisinin başına ekleyerek. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Belirtilen ölçekleme işlemini bunun dönüştürme matrisine uygular.Graphics belirtilen sırada. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) belirtilenin Clip özelliğine[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) belirtilene[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesini ve bir tarafından belirtilen dikdörtgeni birleştiren belirtilen işlemin sonucuna[`Rectangle`](../rectangle) yapı. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesini ve bir tarafından belirtilen dikdörtgeni birleştiren belirtilen işlemin sonucuna[`RectangleF`](../rectanglef) yapı. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesinin belirtilen birleştirme işleminin ve belirtilenin Clip özelliğinin sonucuna[`Graphics`](../graphics) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesini ve belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesini ve bir tarafından belirtilen dikdörtgeni birleştiren belirtilen işlemin sonucuna[`Rectangle`](../rectangle) yapı. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | Bunun kırpma bölgesini ayarlar[`Graphics`](../graphics) geçerli klip bölgesini ve bir tarafından belirtilen dikdörtgeni birleştiren belirtilen işlemin sonucuna[`RectangleF`](../rectanglef) yapı. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | Bunun kırpma bölgesini ayarlarGraphicsgeçerli klip bölgesini ve belirtilen alanı birleştirerek belirtilen işlemin sonucunaRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | Bunun geçerli dünyasını ve sayfa dönüşümlerini kullanarak bir nokta dizisini bir koordinat alanından diğerine dönüştürürGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | Bunun geçerli dünyasını ve sayfa dönüşümlerini kullanarak bir nokta dizisini bir koordinat alanından diğerine dönüştürürGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | Bunun kırpma bölgesini çevirirGraphics yatay ve dikey yönlerde belirtilen miktarlarda. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | Bunun kırpma bölgesini çevirirGraphics yatay ve dikey yönlerde belirtilen miktarlarda. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | Belirtilen çeviri öğesini bunun dönüştürme matrisine ekleyerek koordinat sisteminin kökenini değiştirirGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Belirtilen çeviriyi bunun dönüşüm matrisine uygulayarak koordinat sisteminin orijinini değiştirirGraphics belirtilen sırada. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | ne zaman yapılacağına karar vermek için bir geri arama yöntemi sağlar.[`DrawImage`](./drawimage) yöntem, yürütmeyi zamanından önce iptal etmeli ve bir görüntü çizmeyi bırakmalıdır. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | için bir geri arama yöntemi sağlar.[`EnumerateMetafile`](./enumeratemetafile) yöntem. |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
