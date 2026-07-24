---
title: "PsDocument"
second_title: "Aspose.Page for Java API संदर्भ"
description: "यह वर्ग PS/EPS दस्तावेज़ों को समेटता है।"
type: docs
weight: 16
url: /hi/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

यह वर्ग PS/EPS दस्तावेज़ों को समेटता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PsDocument()](#PsDocument--) | खाली PsDocument को प्रारंभित पृष्ठ के साथ आरंभ करता है। |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | खाली PsDocument को प्रारंभित पृष्ठ के साथ आरंभ करता है। |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | खाली PsDocument को प्रारंभित पृष्ठ के साथ आरंभ करता है। |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | खाली PsDocument को आरंभ करता है। |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | खाली PsDocument को आरंभ करता है। |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | जब पोस्टस्क्रिप्ट दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली PsDocument को आरंभ करता है। |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | जब पोस्टस्क्रिप्ट दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली PsDocument को आरंभ करता है। |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | इनपुट PS/EPS फ़ाइल के साथ PsDocument को आरंभ करता है। |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | PS/EPS फ़ाइल की स्ट्रीम के साथ PsDocument को आरंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है। |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है और फिर "newpath" ऑपरेटर लिखता है। |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | वर्तमान ग्राफ़िक्स स्थिति में क्लिपिंग आयत जोड़ता है। |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | दिए गए फ़ॉन्ट में दिए गए पाठ की रूपरेखा से क्लिप जोड़ता है। |
| [closePage()](#closePage--) | वर्तमान पृष्ठ को पूर्ण करें। |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Type 1 फ़ॉन्ट को TrueType में परिवर्तित करता है। |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Type 3 फ़ॉन्ट को TrueType में परिवर्तित करता है। |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Type 3 फ़ॉन्ट को TrueType में परिवर्तित करता है। |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | दिए गए PsDocument को EPS फ़ाइल के रूप में क्रॉप करता है। |
| [draw(Shape shape)](#draw-java.awt.Shape-) | एक मनमाना पथ बनाएं। |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | मास्क्ड छवि बनाएं। |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | एक छवि बनाएं। |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | पृष्ठभूमि के साथ परिवर्तित छवि बनाएं। |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | पृष्ठभूमि के साथ परिवर्तित पारदर्शी छवि बनाएं। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | EPS फ़ाइल को पढ़ता है और EPS छवि का बाउंडिंग बॉक्स %%BoundingBox टिप्पणी से या डिफ़ॉल्ट पृष्ठ आकार (0, 0, 595, 842) के बाउंड्स से निकालता है यदि वह मौजूद नहीं है। |
| [extractEpsSize()](#extractEpsSize--) | EPS फ़ाइल को पढ़ता है और EPS छवि का आकार %%BoundingBox टिप्पणी से या डिफ़ॉल्ट पृष्ठ आकार (595, 842) से निकालता है यदि वह मौजूद नहीं है। |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | PS फ़ाइल से पाठ निकालता है। |
| [fill(Shape shape)](#fill-java.awt.Shape-) | एक मनमाना पथ भरें। |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | परिणामी PDF दस्तावेज़ में पृष्ठों की संख्या प्राप्त करता है। |
| [getPaint()](#getPaint--) | वर्तमान ग्राफ़िक्स स्थिति में पेंट प्राप्त करता है। |
| [getStroke()](#getStroke--) | वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक प्राप्त करता है। |
| [getXmpMetadata()](#getXmpMetadata--) | PS/EPS फ़ाइल पढ़ता है और यदि XmpMetdata पहले से मौजूद है तो उसे निकालता है, या यदि नहीं है तो नया जोड़ता है। |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | यह दर्शाता है कि Aspose.Page for Java उत्पाद लाइसेंस एक्सेस किया गया है और वैध है या नहीं। |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है। |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है। |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है। |
| [openPage(String pageName)](#openPage-java.lang.String-) | दस्तावेज़ के आकार के साथ एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है। |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | दिए गए PsDocument को EPS फ़ाइल के रूप में आकार बदलता है। |
| [rotate(float angleRadians)](#rotate-float-) | मूल बिंदु के चारों ओर वर्तमान ग्राफ़िक्स स्थिति में घड़ी की दिशा के विपरीत घुमाव जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)। |
| [rotate(int angleDegrees)](#rotate-int-) | मूल बिंदु के चारों ओर वर्तमान ग्राफ़िक्स स्थिति में घड़ी की दिशा के विपरीत घुमाव जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)। |
| [save()](#save--) | दिए गए PsDocument को PS या EPS फ़ाइल के रूप में सहेजता है। |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS फ़ाइल को एक डिवाइस पर सहेजता है। |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | दिए गए PsDocument को स्ट्रीम में सहेजता है। |
| [save(String outEpsFilePath)](#save-java.lang.String-) | दिए गए PsDocument को EPS फ़ाइल के रूप में सहेजता है। |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS फ़ाइल को इमेज फ़ाइल में सहेजता है। |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | PS/EPS फ़ाइल को निर्दिष्ट निर्देशिका में निर्दिष्ट फ़ाइल नाम के साथ इमेज फ़ाइल में सहेजता है। |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS फ़ाइल को इमेज बाइट्स एरेज़ में सहेजता है। |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS फ़ाइल को आउटपुट PDF स्ट्रीम में सहेजता है। |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS फ़ाइल को PDF फ़ाइल में सहेजता है। |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | BufferedImage ऑब्जेक्ट को EPS फ़ाइल में सहेजता है। |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | BufferedImage ऑब्जेक्ट को EPS फ़ाइल में सहेजता है। |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | इनपुट स्ट्रीम से PNG/JPEG/BMP/GIF इमेज को EPS आउटपुट स्ट्रीम में सहेजता है। |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | फ़ाइल से PNG/JPEG/BMP/GIF इमेज को EPS फ़ाइल में सहेजता है। |
| [scale(float xScale, float yScale)](#scale-float-float-) | वर्तमान ग्राफ़िक्स स्थिति में स्केल जोड़ता है (वर्तमान मैट्रिक्स को स्केल करता है)। |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | एक इनपुट स्ट्रीम निर्दिष्ट करता है। |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | पेज डिवाइस पैरामीटर सेट करता है (ऑपरेटर "setpagedevice" PostScript विशिष्टता देखें)। |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | पेज आकार सेट करता है। |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | वर्तमान ग्राफ़िक्स स्थिति में पेंट सेट करता है। |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक सेट करता है। |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | वर्तमान ट्रांसफ़ॉर्मेशन को इस पर सेट करें। |
| [shear(float shx, float shy)](#shear-float-float-) | वर्तमान ग्राफ़िक्स स्थिति में शियर ट्रांसफ़ॉर्मेशन जोड़ता है (वर्तमान मैट्रिक्स को शियर करता है)। |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | वर्तमान ग्राफ़िक्स स्थिति में ट्रांसफ़ॉर्मेशन जोड़ता है (इस मैट्रिक्स को वर्तमान वाले के साथ जोड़ता है)। |
| [translate(float x, float y)](#translate-float-float-) | वर्तमान ग्राफ़िक्स स्थिति में ट्रांसलेशन जोड़ता है (वर्तमान मैट्रिक्स को ट्रांसलेट करता है)। |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | वर्तमान ग्राफ़िक्स स्थिति को पुनर्स्थापित करने के लिए लिखता है (ऑपरेटर "grestore" पर PostScript विशिष्टता देखें)। |
| [writeGraphicsSave()](#writeGraphicsSave--) | वर्तमान ग्राफ़िक्स स्थिति को सहेजने के लिए लिखता है (ऑपरेटर "gsave" पर PostScript विशिष्टता देखें)। |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


खाली PsDocument को प्रारंभिक पेज के साथ इनिशियलाइज़ करता है। यह कंस्ट्रक्टर केवल अतिरिक्त ऑपरेशनों के लिए उपयोग किया जाता है जो PostScript फ़ाइलों से संबंधित नहीं हैं, उदाहरण के लिए फ़ॉन्ट बदलना।

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


खाली PsDocument को प्रारंभित पृष्ठ के साथ आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | java.lang.String | आउटपुट PS/EPS फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


खाली PsDocument को प्रारंभित पृष्ठ के साथ आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS फ़ाइल को सहेजने के लिए स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


खाली PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | java.lang.String | आउटपुट PS/EPS फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| multipaged | boolean | यदि false है तो पेज इनिशियलाइज़ नहीं होगा। इस मामले में पेज इनिशियलाइज़ेशन को स्पष्ट "openPage(width, height) call के माध्यम से किया जाना चाहिए। |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


खाली PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS फ़ाइल को सहेजने के लिए स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| multipaged | boolean | यदि false है तो पेज इनिशियलाइज़ नहीं होगा। इस मामले में पेज इनिशियलाइज़ेशन को स्पष्ट "openPage(width, height) call के माध्यम से किया जाना चाहिए। |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


जब पोस्टस्क्रिप्ट दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | java.lang.String | आउटपुट PS/EPS फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| numberOfPages | int | PostScript दस्तावेज़ में पेजों की संख्या। |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


जब पोस्टस्क्रिप्ट दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS फ़ाइल को सहेजने के लिए स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| numberOfPages | int | PostScript दस्तावेज़ में पेजों की संख्या। |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


इनपुट PS/EPS फ़ाइल के साथ PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS फ़ाइल पथ। |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


PS/EPS फ़ाइल की स्ट्रीम के साथ PsDocument को आरंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psStream | java.io.InputStream | PS/EPS फ़ाइल की स्ट्रीम। |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | java.awt.Shape | क्लिपिंग पाथ। |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है और फिर "newpath" ऑपरेटर लिखता है। यह इस क्लिपिंग पाथ और कुछ बाद के पाथ जैसे कि "charpath" ऑपरेटर से रेखांकित ग्लिफ़्स के मिलन से बचने के लिए आवश्यक है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | java.awt.Shape | क्लिपिंग पाथ। |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


वर्तमान ग्राफ़िक्स स्थिति में क्लिपिंग आयत जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | क्लिपिंग आयत। |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


दिए गए फ़ॉन्ट में दिए गए पाठ की रूपरेखा से क्लिप जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | पाठ। |
| font | java.awt.Font | फ़ॉन्ट। |
| x | float | पाठ की स्थिति का X निर्देशांक। |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


वर्तमान पृष्ठ को पूर्ण करें।

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Type 1 फ़ॉन्ट को TrueType में परिवर्तित करता है। परिवर्तित TTF फ़ॉन्ट फ़ाइल का नाम इनपुट Type 1 फ़ॉन्ट के समान रहेगा, जिसमें ".ttf" एक्सटेंशन होगा। TTF फ़ाइल को निर्धारित आउटपुट डायरेक्टरी में सहेजा जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Type 1 फ़ॉन्ट फ़ाइल पथ.. |
| outputDir | java.lang.String | आउटपुट डायरेक्टरी जहाँ परिणामी TrueType फ़ॉन्ट सहेजा जाएगा। |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Type 3 फ़ॉन्ट को TrueType में परिवर्तित करता है। TTF फ़ाइल प्रदान किए गए आउटपुट स्ट्रीम में सहेजी जाएगी।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 फ़ॉन्ट फ़ाइल पथ। |
| outputStream | java.io.OutputStream | आउटपुट स्ट्रीम जहाँ परिणामी TrueType फ़ॉन्ट सहेजा जाएगा। |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Type 3 फ़ॉन्ट को TrueType में परिवर्तित करता है। परिवर्तित TTF फ़ॉन्ट फ़ाइल का नाम इनपुट Type 3 फ़ॉन्ट के समान रहेगा, जिसमें ".ttf" एक्सटेंशन होगा। TTF फ़ाइल को निर्धारित आउटपुट डायरेक्टरी में सहेजा जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 फ़ॉन्ट फ़ाइल पथ.. |
| outputDir | java.lang.String | आउटपुट डायरेक्टरी जहाँ परिणामी TrueType फ़ॉन्ट सहेजा जाएगा। |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


दिए गए PsDocument को EPS फ़ाइल के रूप में क्रॉप करता है। यह प्रारंभिक EPS फ़ाइल को अपडेटेड मौजूदा %%BoundingBox के साथ सहेजता है या नया बनाया जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | क्रॉप बॉक्स (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


एक मनमाना पथ बनाएं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| shape | java.awt.Shape | भरण के लिए पथ। |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


मास्क्ड छवि बनाएं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | ड्रॉ करने के लिए छवि। इसे 24bpp RGB छवि प्रारूप में होना चाहिए। |
| alphaMask1bpp | java.awt.image.BufferedImage | छवि मास्क। इसे 1bpp छवि प्रारूप में होना चाहिए। |
| transform | java.awt.geom.AffineTransform | छवि को परिवर्तित करने के लिए मैट्रिक्स। |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


एक छवि बनाएं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | ड्रॉ करने के लिए छवि। |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


पृष्ठभूमि के साथ परिवर्तित छवि बनाएं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | ड्रॉ करने के लिए छवि। |
| transform | java.awt.geom.AffineTransform | छवि को परिवर्तित करने के लिए मैट्रिक्स। |
| bkg | java.awt.Color | छवि के लिए पृष्ठभूमि। |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


पृष्ठभूमि के साथ परिवर्तित पारदर्शी छवि को ड्रॉ करें। यदि छवि में अल्फा चैनल नहीं है तो इसे अपारदर्शी छवि के रूप में ड्रॉ किया जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | ड्रॉ करने के लिए छवि। |
| transform | java.awt.geom.AffineTransform | छवि को परिवर्तित करने के लिए मैट्रिक्स। |
| transparencyThreshold | int | एक थ्रेशोल्ड जो निर्धारित करता है कि किस पारदर्शिता मान से पिक्सेल को पूरी तरह पारदर्शी माना जाएगा। इस थ्रेशोल्ड से नीचे के सभी मानों को पूरी तरह अपारदर्शी माना जाएगा। |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


EPS फ़ाइल को पढ़ता है और EPS छवि का बाउंडिंग बॉक्स %%BoundingBox टिप्पणी से या डिफ़ॉल्ट पृष्ठ आकार (0, 0, 595, 842) के बाउंड्स से निकालता है यदि वह मौजूद नहीं है।

**Returns:**
int[] - EPS छवि का बाउंडिंग बॉक्स।
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


EPS फ़ाइल को पढ़ता है और EPS छवि का आकार %%BoundingBox टिप्पणी से या डिफ़ॉल्ट पृष्ठ आकार (595, 842) से निकालता है यदि वह मौजूद नहीं है।

**Returns:**
java.awt.Dimension - EPS छवि का आकार।
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


PS फ़ाइल से पाठ निकालता है। यह केवल उन पाठों के लिए काम करता है जो TrueType फ़ॉन्ट्स (टाइप 42) या संयुक्त फ़ॉन्ट्स (टाइप 0) के साथ लिखे गए हैं, जो TrueType फ़ॉन्ट्स से बने होते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | सेव विकल्प। |
| startPage | int | वह पृष्ठ जिससे समावेशी रूप से पाठ निकालना शुरू करना है। |
| endPage | int | उस पृष्ठ को जहाँ समावेशी रूप से पाठ निकाला जाएगा। |

**Returns:**
java.lang.String - PS फ़ाइल के चयनित पृष्ठों में मौजूद पाठ।
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


एक मनमाना पथ भरें।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| shape | java.awt.Shape | भरण के लिए पथ। |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fillPaint | java.awt.Paint | ग्लिफ़ के आंतरिक भाग को पेंट करने के लिए उपयोग किया गया फ़िल। |
| strokePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fillPaint | java.awt.Paint | ग्लिफ़ के आंतरिक भाग को पेंट करने के लिए उपयोग किया गया फ़िल। |
| strokePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। advances ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| advances | float[] |  |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fillPaint | java.awt.Paint | ग्लिफ़ के आंतरिक भाग को पेंट करने के लिए उपयोग किया गया फ़िल। |
| strokePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


ग्लिफ़ के अंदर को भरकर और ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fillPaint | java.awt.Paint | ग्लिफ़ के आंतरिक भाग को पेंट करने के लिए उपयोग किया गया फ़िल। |
| strokePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fill | java.awt.Paint | ग्लिफ़ को पेंट करने के लिए उपयोग किया गया फ़िल। |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fill | java.awt.Paint | ग्लिफ़ को पेंट करने के लिए उपयोग किया गया फ़िल। |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| font | java.awt.Font | फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fill | java.awt.Paint | ग्लिफ़ को पेंट करने के लिए उपयोग किया गया फ़िल। |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| font | java.awt.Font | फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| fill | java.awt.Paint | ग्लिफ़ को पेंट करने के लिए उपयोग किया गया फ़िल। |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


परिणामी PDF दस्तावेज़ में पृष्ठों की संख्या प्राप्त करता है।

**Returns:**
int - पृष्ठों की संख्या।
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


वर्तमान ग्राफ़िक्स स्थिति में पेंट प्राप्त करता है।

**Returns:**
java.awt.Paint - वर्तमान पेंट।
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक प्राप्त करता है।

**Returns:**
java.awt.Stroke - वर्तमान स्ट्रोक।
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


PS/EPS फ़ाइल पढ़ता है और यदि XmpMetdata पहले से मौजूद है तो उसे निकालता है, या यदि नहीं है तो नया जोड़ता है।

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


यह दर्शाता है कि Aspose.Page for Java उत्पाद लाइसेंस एक्सेस किया गया है और वैध है या नहीं।

**Returns:**
boolean - बूलियन मान
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS फ़ाइलें इस फ़ाइल के साथ आउटपुट डिवाइस पर मर्ज करने के लिए। |
| device | [Device](../../com.aspose.page/device) | एक आउटपुट डिवाइस। |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | एक आउटपुट PDF स्ट्रीम। |
| filesForMerge | java.lang.String[] | PS/EPS फ़ाइलें इस फ़ाइल के साथ आउटपुट डिवाइस पर मर्ज करने के लिए। |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | एक आउटपुट PDF फ़ाइल पथ। |
| filesForMerge | java.lang.String[] | PS/EPS फ़ाइलें इस फ़ाइल के साथ आउटपुट डिवाइस पर मर्ज करने के लिए। |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public void openPage(float width, float height)
```


एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | नई पृष्ठ की चौड़ाई। |
| ऊँचाई | float | नई पृष्ठ की ऊँचाई। |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


दस्तावेज़ के आकार के साथ एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pageName | java.lang.String | नई पृष्ठ का नाम। यदि यह null है तो पृष्ठ का नाम पृष्ठ के क्रमांक के रूप में होगा। |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| outlinePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont वह फ़ॉन्ट है जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ोल्डर में स्थित कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| outlinePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| advances | float[] | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| font | java.awt.Font | फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| outlinePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| font | java.awt.Font | सिस्टम फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


ग्लिफ़ के कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | java.lang.String | जोड़ने के लिए पाठ। |
| font | java.awt.Font | फ़ॉन्ट जो पाठ को ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | float | पाठ मूल बिंदु के लिए X निर्देशांक। |
| y | float | पाठ मूल बिंदु के लिए Y निर्देशांक। |
| outlinePaint | java.awt.Paint | ग्लिफ़ की रूपरेखा को पेंट करने के लिए उपयोग किया गया java.awt.Paint। यह JDK में java.awt.Paint वर्ग की कोई भी उपवर्ग हो सकता है। |
| stroke | java.awt.Stroke | ग्लिफ़ की रूपरेखा को ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


दिए गए PsDocument को EPS फ़ाइल के रूप में आकार बदलता है। यह विधि केवल EPS आकार निकालने के बाद उपयोग की जाती है। यह प्रारंभिक EPS फ़ाइल को अपडेटेड मौजूदा %%BoundingBox के साथ सहेजता है या नया बनाया जाएगा। पृष्ठ परिवर्तन मैट्रिक्स भी सेट किया जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | निर्धारित इकाइयों में EPS छवि का नया आकार। |
| units | [Units](../../com.aspose.page/units) | नए आकार की इकाइयाँ। यह पॉइंट्स, इंच, मिलीमीटर, सेंटीमीटर और प्रारंभिक आकार के प्रतिशत हो सकते हैं। |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


मूल बिंदु के चारों ओर वर्तमान ग्राफ़िक्स स्थिति में घड़ी की दिशा के विपरीत घुमाव जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angleRadians | float | रैडियन में घूर्णन का कोण। |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


मूल बिंदु के चारों ओर वर्तमान ग्राफ़िक्स स्थिति में घड़ी की दिशा के विपरीत घुमाव जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angleDegrees | int | डिग्री में घूर्णन का कोण। |

### save() {#save--}
```
public void save()
```


दिए गए PsDocument को PS या EPS फ़ाइल के रूप में सहेजता है। यह विधि केवल तब उपयोग की जाती है जब PsDocument को शून्य से बनाया गया हो।

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


PS/EPS फ़ाइल को एक डिवाइस पर सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | एक आउटपुट डिवाइस। |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


दिए गए PsDocument को स्ट्रीम में सहेजता है। यह विधि केवल XMP मेटाडेटा को अपडेट करने के बाद उपयोग की जाती है। यह प्रारंभिक EPS फ़ाइल को अपडेटेड मौजूदा मेटाडेटा के साथ सहेजता है या getMetadata मेथड को कॉल करते समय नया बनाया गया फ़ाइल। अंतिम मामले में सभी आवश्यक PostScript कोड और EPS टिप्पणियाँ जोड़ी जाती हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | java.io.OutputStream | आउटपुट EPS फ़ाइल की स्ट्रीम। |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


दिए गए PsDocument को EPS फ़ाइल के रूप में सहेजता है। यह विधि केवल XMP मेटाडेटा को अपडेट करने के बाद उपयोग की जाती है। यह प्रारंभिक EPS फ़ाइल को अपडेटेड मौजूदा मेटाडेटा के साथ सहेजता है या getMetadata मेथड को कॉल करते समय नया बनाया गया फ़ाइल। अंतिम मामले में सभी आवश्यक PostScript कोड और EPS टिप्पणियाँ जोड़ी जाती हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | एक आउटपुट EPS फ़ाइल पथ.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


PS/EPS फ़ाइल को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट PS फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से इनिशियलाइज़ किया गया है जो FileInputStream से नहीं निकली है, तो इमेज फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्प्लेट के साथ सहेजी जाएगी।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | इमेज सहेजने के लिए आवश्यक पैरामीटर और रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ PS/EPS फ़ाइल को इमेज फ़ाइल में सहेजता है। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | इमेज सहेजने के लिए आवश्यक पैरामीटर और रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |
| outDir | java.lang.String | आउटपुट डायरेक्टरी जहाँ इमेज फ़ाइल सहेजी जाएगी। |
| fileNameTemplate | java.lang.String | इमेज के लिए फ़ाइल नाम टेम्प्लेट (बिना एक्सटेंशन के)। यदि इनपुट PS/EPS फ़ाइल एक पृष्ठीय है तो यह ठीक फ़ाइल नाम होगा, अन्यथा "\_[n]", जहाँ "n" - पृष्ठ संख्या 0 से शुरू होती है, इस पर प्रत्यय जोड़ा जाएगा। फ़ाइल एक्सटेंशन "option" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा। |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


PS/EPS फ़ाइल को इमेज बाइट्स एरेज़ में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | इमेज सहेजने के लिए आवश्यक पैरामीटर और रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

**Returns:**
byte[][] - इमेज बाइट्स। प्रत्येक पृष्ठ के लिए एक बाइट एरे।
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


PS/EPS फ़ाइल को आउटपुट PDF स्ट्रीम में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | एक आउटपुट PDF स्ट्रीम। |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


PS/EPS फ़ाइल को PDF फ़ाइल में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | एक आउटपुट PDF फ़ाइल पथ। |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | परिवर्तन के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले फ़्लैग्स शामिल हैं। |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


BufferedImage ऑब्जेक्ट को EPS फ़ाइल में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | इमेज। |
| epsStream | java.io.OutputStream | EPS आउटपुट स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले पैरामीटर शामिल हैं। |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


BufferedImage ऑब्जेक्ट को EPS फ़ाइल में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | इमेज। |
| epsFilePath | java.lang.String | EPS फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले पैरामीटर शामिल हैं। |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


इनपुट स्ट्रीम से PNG/JPEG/BMP/GIF इमेज को EPS आउटपुट स्ट्रीम में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageStream | java.io.InputStream | इमेज इनपुट स्ट्रीम। |
| epsStream | java.io.OutputStream | EPS आउटपुट स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले पैरामीटर शामिल हैं। |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


फ़ाइल से PNG/JPEG/BMP/GIF इमेज को EPS फ़ाइल में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageFilePath | java.lang.String | इमेज फ़ाइल पथ। |
| epsFilePath | java.lang.String | EPS फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | रूपांतरण के दौरान उत्पन्न त्रुटियों के आउटपुट को निर्दिष्ट करने वाले पैरामीटर शामिल हैं। |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


वर्तमान ग्राफ़िक्स स्थिति में स्केल जोड़ता है (वर्तमान मैट्रिक्स को स्केल करता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xScale | float | X अक्ष में स्केल। |
| yScale | float | Y अक्ष में स्केल। |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


एक इनपुट स्ट्रीम निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| is | java.io.InputStream | PS/EPS फ़ाइल की इनपुट स्ट्रीम। |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


पेज डिवाइस पैरामीटर सेट करता है (ऑपरेटर "setpagedevice" PostScript स्पेसिफिकेशन देखें)। इनमें पेज आकार, रंग आदि शामिल हो सकते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | पृष्ठ के पैरामीटर। इस शब्दकोश में पृष्ठ आकार और रंग आदि हो सकते हैं। |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


पृष्ठ आकार सेट करता है। एक दस्तावेज़ में विभिन्न आकार के पृष्ठ बनाने के लिए इस विधि के तुरंत बाद  setPageDevice  विधि का उपयोग करें।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | परिणामी PostScript फ़ाइल में पृष्ठ की चौड़ाई। |
| ऊँचाई | float | परिणामी PostScript फ़ाइल में पृष्ठ की ऊँचाई। |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


वर्तमान ग्राफ़िक्स स्थिति में पेंट सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| paint | java.awt.Paint | पेंट। यह JDK में मौजूद  Paint  क्लास की कोई भी उपक्लास हो सकता है। |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stroke | java.awt.Stroke | स्ट्रोक। |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


वर्तमान ट्रांसफ़ॉर्मेशन को इस पर सेट करें।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | रूपांतरण। |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


वर्तमान ग्राफ़िक्स स्थिति में शियर ट्रांसफ़ॉर्मेशन जोड़ता है (वर्तमान मैट्रिक्स को शियर करता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| shx | float | X अक्ष में शियर। |
| shy | float | Y अक्ष में शियर। |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


वर्तमान ग्राफ़िक्स स्थिति में ट्रांसफ़ॉर्मेशन जोड़ता है (इस मैट्रिक्स को वर्तमान वाले के साथ जोड़ता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | रूपांतरण। |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


वर्तमान ग्राफ़िक्स स्थिति में ट्रांसलेशन जोड़ता है (वर्तमान मैट्रिक्स को ट्रांसलेट करता है)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | X दिशा में अनुवाद। |
| y | float | Y दिशा में अनुवाद। |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


वर्तमान ग्राफ़िक्स स्थिति को पुनर्स्थापित करने के लिए लिखता है (ऑपरेटर "grestore" पर PostScript विशिष्टता देखें)।

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


वर्तमान ग्राफ़िक्स स्थिति को सहेजने के लिए लिखता है (ऑपरेटर "gsave" पर PostScript विशिष्टता देखें)।

