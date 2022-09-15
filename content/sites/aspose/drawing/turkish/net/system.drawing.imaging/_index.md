---
title: System.Drawing.Imaging
second_title: Aspose.Drawing for .NET API Referansı
description: Imaging ad alanı gelişmiş GDI görüntüleme işlevi sağlar. Temel grafik işleviDrawing ad alanı.
type: docs
weight: 40
url: /tr/net/system.drawing.imaging/
---
Imaging ad alanı, gelişmiş GDI+ görüntüleme işlevi sağlar. Temel grafik işlevi,Drawing ad alanı.

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [BitmapData](./bitmapdata) | Bir bitmap görüntüsünün özniteliklerini belirtir. buBitmapData sınıf the tarafından kullanılırLockBits veUnlockBits yöntemleriBitmap sınıf. Kalıtsal değil. |
| [ColorMap](./colormap) | Renkleri dönüştürmek için bir harita tanımlar. Birkaç yöntem,ImageAttributes bir dizi olan bir renk yeniden eşleme tablosu kullanarak sınıf ayar görüntü renkleriColorMap yapılar. Devralınamaz. |
| [ColorMatrix](./colormatrix) | RGBA alanı için koordinatları içeren 5 x 5'lik bir matris tanımlar. ImageAttributes sınıf, bir renk matrisi kullanarak görüntü renklerini ayarlar. Bu sınıf devralınamaz. |
| [ColorPalette](./colorpalette) | Bir renk paletini oluşturan bir renk dizisini tanımlar. Renkler 32 bit ARGB renkleridir. Devralınamaz. |
| [Encoder](./encoder) | BirEncoder nesne, bir görüntü kodlayıcı parametresinin kategorisini tanımlayan genel olarak benzersiz bir tanımlayıcıyı (GUID) içine alır. |
| [EncoderParameter](./encoderparameter) | Bir görüntü kodlayıcıya bir değer veya bir dizi değer iletmek için kullanılır. |
| [EncoderParameters](./encoderparameters) | Bir diziyi kapsüllerEncoderParameter nesneler. |
| [FrameDimension](./framedimension) | Bir görüntünün çerçeve boyutlarını alan özellikler sağlar. Devralınamaz. |
| [ImageAttributes](./imageattributes) | Oluşturma sırasında bitmap ve meta dosyası renklerinin nasıl değiştirildiği hakkında bilgi içerir. |
| [ImageCodecInfo](./imagecodecinfo) | ImageCodecInfo sınıfı, kurulu görüntü kodlayıcılar ve kod çözücüler (kod çözücüler olarak adlandırılır) hakkındaki tüm ilgili bilgileri almak için gerekli depolama üyelerini ve yöntemlerini sağlar. Devralınamaz. |
| [ImageFormat](./imageformat) | Görüntünün dosya biçimini belirtir. Devralınamaz. |
| [Metafile](./metafile) | Bir grafik meta dosyası tanımlar. Bir meta dosyası, kaydedilebilen (oluşturulabilen) ve oynatılabilen (görüntülenebilen) bir dizi grafik işlemi tanımlayan kayıtları içerir. Bu sınıf devralınamaz. |
| [MetafileHeader](./metafileheader) | İlişkili birMetafile . Devralınamaz. |
| [MetaHeader](./metaheader) | Windows biçimli (WMF) meta dosyası hakkında bilgi içerir. |
| [NamespaceDoc](./namespacedoc) | Imaging ad alanı, gelişmiş GDI+ görüntüleme işlevi sağlar. Temel grafik işlevi,Drawing ad alanı. |
| [PlayRecordCallback](./playrecordcallback) | Bu temsilci kullanılmıyor. Bir meta dosyasının kayıtlarını numaralandırma örneği için, bkz.[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Bir görüntü dosyasına dahil edilecek bir meta veri özelliğini kapsüller. Devralınamaz. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Yerleştirilebilir bir meta dosyası tanımlar. Devralınamaz. |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Hangi GDI+ nesnelerinin renk ayarlama bilgilerini kullandığını belirtir. |
| [ColorChannelFlag](./colorchannelflag) | CMYK (camgöbeği, macenta, sarı, siyah) renk uzayındaki kanalları tek tek belirtir. Bu numaralandırma,[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) yöntemler. |
| [ColorMatrixFlag](./colormatrixflag) | Bir ekranın renk ve gri tonlama ayarı ayarlarından etkilenecek görüntü ve renk türlerini belirtir.ImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Grafik komutlarını okumak ve yazmak için bir meta dosyasıyla kullanılabilecek yöntemleri belirtir. |
| [EmfType](./emftype) | Gelişmiş Meta Dosyası (EMF) dosyasına yerleştirilen kayıtların yapısını belirtir. Bu numaralandırma,Metafile sınıf. |
| [EncoderValue](./encodervalue) | Bir JPEG veya TIFF görüntü kodlayıcısına iletilen parametre değerini belirtmek için kullanılır.EncoderParameters) veyaEncoderParameters) yöntemler. |
| [ImageFlags](./imageflags) | Bir dosyada bulunan piksel verilerinin özniteliklerini belirtir.[`Image`](../system.drawing/image) nesne. Flags özelliği, bu numaralandırmanın bir üyesini döndürür. Bu numaralandırma, üye değerlerinin bit düzeyinde birleşimine izin veren bir FlagsAttribute özniteliğine sahiptir. |
| [ImageLockMode](./imagelockmode) | Komutun flags parametresine geçirilen bayrakları belirtir.[`LockBits`](../system.drawing/bitmap/lockbits) method. [`LockBits`](../system.drawing/bitmap/lockbits) yöntemi, piksel verilerini okuyabilmeniz veya yazabilmeniz için image öğesinin bir bölümünü kilitler. |
| [MetafileFrameUnit](./metafileframeunit) | Bir meta dosyasını boyutlandırmak ve konumlandırmak için kullanılan dikdörtgenin ölçü birimini belirtir. Bu, dosyanın oluşturulması sırasında belirtilir.Metafile nesne. |
| [MetafileType](./metafiletype) | Meta dosya türlerini belirtir. |
| [PixelFormat](./pixelformat) | Görüntüdeki her piksel için renk verilerinin biçimini belirtir. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
