---
title: Class AsposeOcr
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: Aspose.OCR.AsposeOcr कक्ष. Aspose OCR लइब्रेर के लए मुख्य API
type: docs
weight: 20
url: /hi/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR लाइब्रेरी के लिए मुख्य API

```csharp
public class AsposeOcr
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`AsposeOcr` वर्ग. खाली कंस्ट्रक्टर. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | का एक नया उदाहरण प्रारंभ करता है`AsposeOcr` class. अनुमत वर्णों को वर्णमाला गुण के साथ सेट करें। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | छवि के तिरछे कोण की गणना करता है। |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | छवि के तिरछे कोण की गणना करता है। |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | यूआरआई से छवि के झुकाव कोण की गणना करता है। |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | जांचें कि क्या दो छवियों में समान टेक्स्ट है. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | पाठ को ठीक करता है (गलत वर्तनी वाले शब्दों को बदलता है)। |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | छवि पर पाठ क्षेत्रों का पता लगाता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है। |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | छवि पर पाठ क्षेत्रों का पता लगाता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है। |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | जांचें कि छवि टेक्स्ट प्रदान किए गए नियमित अभिव्यक्ति से मेल खाता है या नहीं। |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | जांचें कि क्या इमेज में दिया गया टेक्स्ट फ़्रैगमेंट है. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | दो छवियों पर टेक्स्ट की तुलना करें और एक संख्या लौटाएं जो दर्शाता है कि वे कितने समान हैं (0 से 1)। |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | ओसीआर की सटीकता में सुधार के लिए इमेज प्रीप्रोसेसिंग का उपयोग करें। फ़िल्टर की एक सूची बनाएं जो आपके द्वारा निर्दिष्ट क्रम में इनपुट छवि पर लागू की जाएगी। फ़िल्टर बनाने के लिए उदाहरण: प्रीप्रोसेसिंग फ़िल्टर फ़िल्टर = नया प्रीप्रोसेसिंगफ़िल्टर { प्रीप्रोसेसिंगफ़िल्टर.इनवर्ट () , प्रीप्रोसेसिंगफ़िल्टर.थ्रेशोल्ड(150), प्रीप्रोसेसिंगफ़िल्टर.बिनराइज़(), प्रीप्रोसेसिंगफ़िल्टर.रोटेट (180), प्रीप्रोसेसिंगफ़िल्टर.रीसाइज़ (3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), प्रीप्रोसेसिंग.स्केल.6फ़िल्टर ), प्रीप्रोसेसिंगफ़िल्टर.Dilate() }; आपको उन सभी की आवश्यकता नहीं है। केवल वही सेट करें जिसकी आपको आवश्यकता है. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | ओसीआर की सटीकता में सुधार के लिए इमेज प्रीप्रोसेसिंग का उपयोग करें। फ़िल्टर की एक सूची बनाएं जो आपके द्वारा निर्दिष्ट क्रम में इनपुट छवि पर लागू की जाएगी। फ़िल्टर बनाने के लिए उदाहरण: प्रीप्रोसेसिंग फ़िल्टर फ़िल्टर = नया प्रीप्रोसेसिंगफ़िल्टर { प्रीप्रोसेसिंगफ़िल्टर.इनवर्ट () , प्रीप्रोसेसिंगफ़िल्टर.थ्रेशोल्ड(150), प्रीप्रोसेसिंगफ़िल्टर.बिनराइज़(), प्रीप्रोसेसिंगफ़िल्टर.रोटेट (180), प्रीप्रोसेसिंगफ़िल्टर.रीसाइज़ (3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), प्रीप्रोसेसिंग.स्केल.6फ़िल्टर ), प्रीप्रोसेसिंगफ़िल्टर.Dilate() }; आपको उन सभी की आवश्यकता नहीं है। केवल वही सेट करें जिसकी आपको आवश्यकता है. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | कार प्लेट को पहचानता है. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | कार प्लेट को पहचानता है. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | बहु-पृष्ठ DJVU छवि से पाठ को पहचानें।  निर्दिष्ट करने की क्षमता के साथ डीजेवीयू फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . केवल डीजेवीयू का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | बहु-पृष्ठ DJVU छवि से पाठ को पहचानें।  निर्दिष्ट करने की क्षमता के साथ डीजेवीयू फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . केवल डीजेवीयू का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | आईडी कार्ड पर पाठ को पहचानता है। |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | आईडी कार्ड पर पाठ को पहचानता है। |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | छवि पर पाठ को पहचानता है। |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | छवि पर पाठ को पहचानता है। |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | छवि पर पाठ को पहचानता है।  छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF को सपोर्ट करता है. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | छवि पर पाठ को पहचानता है। |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | छवि पर पाठ को पहचानता है। |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | छवि पर पाठ को पहचानता है। |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | छवि पर टेक्स्ट को अच्छी गुणवत्ता के साथ पहचानें। तिरछा सुधार और क्षेत्रों का पता लगाने का उपयोग नहीं करता। फास्ट मोड में काम करता है। |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | छवि पर टेक्स्ट को अच्छी गुणवत्ता के साथ पहचानें। तिरछा सुधार और क्षेत्रों का पता लगाने का उपयोग नहीं करता। फास्ट मोड में काम करता है। |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | आधार 64 प्रकार में प्रदान की गई छवि पर पाठ को पहचानता है। |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | यूआरआई लिंक द्वारा प्रदान की गई छवि पर पाठ को पहचानता है। |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | चालान छवि पर पाठ को पहचानता है। |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | चालान छवि पर पाठ को पहचानता है। |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | टेक्स्ट की एक पंक्ति वाली छवि को पहचानता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है। |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | टेक्स्ट की एक पंक्ति वाली छवि को पहचानता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है। |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | डिफ़ॉल्ट सेटिंग्स के साथ सूची से कई छवियों को पहचानता है।  संग्रह और फ़ोल्डर समर्थित नहीं हैं। संसाधित छवियों की अधिकतम मात्रा 20 है। GIF, PNG, JPEG, BMP, TIFF, JFIF. का समर्थन करता है |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | ज़िप संग्रह में या डिफ़ॉल्ट सेटिंग्स वाले फ़ोल्डर से पैक की गई कई छवियों को पहचानता है।  नेस्टेड संग्रह और फ़ोल्डर समर्थित नहीं हैं। संसाधित छवियों की अधिकतम मात्रा 20 है। GIF, PNG, JPEG, BMP, TIFF, JFIF. का समर्थन करता है |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | सूची से कई छवियों को पहचानता है।  संग्रह और फ़ोल्डर समर्थित नहीं हैं। संसाधित छवियों की अधिकतम मात्रा 20 है। GIF, PNG, JPEG, BMP, TIFF, JFIF. का समर्थन करता है |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | ज़िप संग्रह या फ़ोल्डर से पैक की गई कई छवियों को पहचानता है।  नेस्टेड संग्रह और फ़ोल्डर समर्थित नहीं हैं। संसाधित छवियों की अधिकतम मात्रा 20 है। GIF, PNG, JPEG, BMP, TIFF, JFIF. का समर्थन करता है |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | पासपोर्ट पर पाठ को पहचानता है। |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | पासपोर्ट पर पाठ को पहचानता है। |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | स्कैन किए गए पीडीएफ से पाठ को पहचानें (चित्र निकालें)  निर्दिष्ट करने की क्षमता के साथ पीडीएफ फाइल को पहचानता है[`RecognitionSettings`](../recognitionsettings/) . केवल स्कैन किए गए PDF का समर्थन करता है। खोजने योग्य PDF का समर्थन नहीं करता. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | स्कैन किए गए पीडीएफ से पाठ को पहचानें (चित्र निकालें)  निर्दिष्ट करने की क्षमता के साथ पीडीएफ फाइल को पहचानता है[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . केवल स्कैन किए गए PDF का समर्थन करता है। खोजने योग्य PDF का समर्थन नहीं करता. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | छवि पर पाठ को पहचानता है। |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | छवि पर पाठ को पहचानता है। |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | बहु-पृष्ठ TIFF छवि से पाठ पहचानें।  निर्दिष्ट करने की क्षमता के साथ TIFF फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . केवल टीआईएफएफ (टीआईएफ) का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | बहु-पृष्ठ TIFF छवि से पाठ पहचानें।  निर्दिष्ट करने की क्षमता के साथ TIFF फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . केवल टीआईएफएफ (टीआईएफ) का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult ऑब्जेक्ट्स की सूची से मल्टीपेज दस्तावेज़ प्राप्त करने की अनुमति देता है |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult ऑब्जेक्ट्स की सूची से मल्टीपेज दस्तावेज़ प्राप्त करने की अनुमति देता है |

## आयोजन

| नाम | विवरण |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | बहु-पृष्ठ छवि पहचान की प्रगति को ट्रैक करने के लिए एक ईवेंट. |

### यह सभी देखें

* नाम स्थान [Aspose.OCR](../../aspose.ocr/)
* सभा [Aspose.OCR](../../)


