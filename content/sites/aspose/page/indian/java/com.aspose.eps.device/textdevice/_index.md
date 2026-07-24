---
title: "TextDevice"
second_title: "Aspose.Page for Java API संदर्भ"
description: 
type: docs
weight: 13
url: /hi/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | वर्तमान डिवाइस संस्करण। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | एक पथ बनाता है। |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | एक आर्क बनाता है। |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | निर्धारित ट्रांसफ़ॉर्म और बैकग्राउंड के साथ इमेज बनाता है। |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | एक लाइन सेगमेंट बनाता है। |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | एक ओवल बनाता है। |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | एक पॉलीगॉन बनाता है। |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | एक पॉलीगॉन बनाता है। |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | एक पॉलीलाइन बनाता है। |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | एक पॉलीलाइन बनाता है। |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | एक रेक्टैंगल बनाता है। |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | एक गोल आयत बनाता है। |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | एक पथ को भरता है। |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | एक चाप को भरता है। |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | एक अंडाकार को भरता है। |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | एक बहुभुज को भरता है। |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | एक बहुभुज को भरता है। |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | एक आयत को भरता है। |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | एक गोल आयत बनाता है। |
| [getBackground()](#getBackground--) | पृष्ठ की वर्तमान पृष्ठभूमि प्राप्त करता है। |
| [getCharTM()](#getCharTM--) | वर्तमान अक्षरों का रूपांतरण प्राप्त करता है। |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | परिणामी डिवाइस आउटपुट के निर्माता को प्राप्त करता है। |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | वर्तमान फ़ॉन्ट प्राप्त करता है। |
| [getOpacity()](#getOpacity--) | वर्तमान अपारदर्शिता प्राप्त करता है। |
| [getOpacityMask()](#getOpacityMask--) | वर्तमान अपारदर्शिता मास्क प्राप्त करता है। |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | वर्तमान पेंट प्राप्त करता है। |
| [getProperties()](#getProperties--) | मेटाडेटा सहित डिवाइस गुण प्राप्त करता है। |
| [getProperty(String key)](#getProperty-java.lang.String-) | स्ट्रिंग गुण का मान प्राप्त करता है। |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | रंग गुण का मान प्राप्त करता है। |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | डबल गुण का मान प्राप्त करता है। |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | इंटीजर गुण का मान प्राप्त करता है। |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | मार्जिन गुण का मान प्राप्त करता है। |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | मैट्रिक्स गुण का मान प्राप्त करता है। |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | आयत गुण का मान प्राप्त करता है। |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | आकार गुण का मान प्राप्त करता है। |
| [getSaveOptions()](#getSaveOptions--) | सेव विकल्प लौटाता है। |
| [getSize()](#getSize--) | पृष्ठ का आकार प्राप्त करता है। |
| [getStroke()](#getStroke--) | वर्तमान स्ट्रोक प्राप्त करता है। |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | वर्तमान टेक्स्ट रेंडरिंग मोड प्राप्त करता है। |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | वर्तमान टेक्स्ट स्ट्रोक की चौड़ाई प्राप्त करता है। |
| [getTransform()](#getTransform--) | वर्तमान ट्रांसफ़ॉर्म प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | डिवाइस का क्लिप प्रारंभ करता है। |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | बूलियन प्रॉपर्टी का मान प्राप्त करता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को घुमाएँ। |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को किसी बिंदु के चारों ओर घुमाएँ। |
| [scale(double x, double y)](#scale-double-double-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को स्केल करें। |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | पृष्ठ की वर्तमान पृष्ठभूमि निर्दिष्ट करता है। |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | अक्षरों का ट्रांसफ़ॉर्म निर्दिष्ट करता है। |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | डिवाइस का क्लिप निर्दिष्ट करता है। |
| [setCreator(String creator)](#setCreator-java.lang.String-) | परिणामी डिवाइस आउटपुट के निर्माता को निर्दिष्ट करता है। |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | फ़ॉन्ट निर्दिष्ट करता है। |
| [setOpacity(float opacity)](#setOpacity-float-) | अपारदर्शिता निर्दिष्ट करता है। |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | एक अपारदर्शिता मास्क निर्दिष्ट करता है। |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | पेंट निर्दिष्ट करता है। |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | मेटाडेटा सहित डिवाइस प्रॉपर्टीज़ निर्दिष्ट करता है। |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | रेंडरिंग प्रक्रिया को प्रबंधित करने के विकल्प निर्दिष्ट करता है। |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | स्ट्रोक निर्दिष्ट करता है। |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | टेक्स्ट रेंडरिंग मोड निर्दिष्ट करता है। |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | टेक्स्ट स्ट्रोक की चौड़ाई निर्दिष्ट करता है। |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | वर्तमान ट्रांसफ़ॉर्म निर्दिष्ट करता है। |
| [shear(double shx, double shy)](#shear-double-double-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को शीयर करता है। |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसफ़ॉर्म करता है। |
| [translate(double x, double y)](#translate-double-double-) | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसलेट करता है। |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | एक टिप्पणी लिखता है। |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | निर्दिष्ट फ़ॉन्ट के साथ स्ट्रिंग लिखता है। |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


वर्तमान डिवाइस संस्करण।

### closePage() {#closePage--}
```
public void closePage()
```


पृष्ठ रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है।

### create() {#create--}
```
public Device create()
```


इस डिवाइस की एक प्रति बनाता है।

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


डिवाइस को नष्ट करता है।

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


एक पथ बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | java.awt.Shape | एक खींची जाने वाली पथ। |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


एक आर्क बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | वक्र के केंद्र का X निर्देशांक। |
| y | float | वक्र के केंद्र का Y निर्देशांक। |
| चौड़ाई | float | एक परिधीय आयत की चौड़ाई। |
| ऊँचाई | float | एक परिधीय आयत की ऊँचाई। |
| startAngle | float | एक वक्र का प्रारंभिक कोण। |
| arcAngle | float | वक्र का एक कोण। |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


निर्धारित ट्रांसफ़ॉर्म और बैकग्राउंड के साथ इमेज बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | खींची जाने वाली एक छवि। |
| transform | java.awt.geom.AffineTransform | एक रूपांतरण। |
| bkg | java.awt.Color | एक पृष्ठभूमि रंग। |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


एक लाइन सेगमेंट बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x1 | float | सेगमेंट की शुरुआत का X निर्देशांक। |
| y1 | float | सेगमेंट की शुरुआत का Y निर्देशांक। |
| x2 | float | सेगमेंट के अंत का X निर्देशांक। |
| y2 | float | सेगमेंट के अंत का Y निर्देशांक। |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


एक ओवल बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | अंडाकार के केंद्र का X निर्देशांक। |
| y | float | ओवल के केंद्र का Y निर्देशांक। |
| चौड़ाई | float | एक परिधीय आयत की चौड़ाई। |
| ऊँचाई | float | एक परिधीय आयत की ऊँचाई। |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


एक पॉलीगॉन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | float[] | बिंदुओं के X निर्देशांक। |
| yPoints | float[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


एक पॉलीगॉन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | int[] | बिंदुओं के X निर्देशांक। |
| yPoints | int[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


एक पॉलीलाइन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | float[] | बिंदुओं के X निर्देशांक। |
| yPoints | float[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


एक पॉलीलाइन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | int[] | बिंदुओं के X निर्देशांक। |
| yPoints | int[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


एक रेक्टैंगल बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | आयत के ऊपरी बाएँ कोने का X निर्देशांक। |
| y | float | आयत के ऊपरी बाएँ कोने का Y निर्देशांक। |
| चौड़ाई | float | आयत की चौड़ाई। |
| ऊँचाई | float | आयत की ऊँचाई। |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


एक गोल आयत बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | आयत के ऊपरी बाएँ कोने का X निर्देशांक। |
| y | float | आयत के ऊपरी बाएँ कोने का Y निर्देशांक। |
| चौड़ाई | float | आयत की चौड़ाई। |
| ऊँचाई | float | आयत की ऊँचाई। |
| arcWidth | float | आर्क के वह घेराव आयत की चौड़ाई जो आयत के कोण को गोल करता है। |
| arcHeight | float | आर्क के वह घेराव आयत की ऊँचाई जो आयत के कोण को गोल करता है। |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


दिए गए बिंदु पर स्ट्रिंग को ड्रॉ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


दस्तावेज़ रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है।

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


एक पथ को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | java.awt.Shape | भरे जाने वाला पाथ। |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


एक चाप को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | वक्र के केंद्र का X निर्देशांक। |
| y | float | वक्र के केंद्र का Y निर्देशांक। |
| चौड़ाई | float | एक परिधीय आयत की चौड़ाई। |
| ऊँचाई | float | एक परिधीय आयत की ऊँचाई। |
| startAngle | float | एक वक्र का प्रारंभिक कोण। |
| arcAngle | float | वक्र का एक कोण। |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


एक अंडाकार को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | अंडाकार के केंद्र का X निर्देशांक। |
| y | float | ओवल के केंद्र का Y निर्देशांक। |
| चौड़ाई | float | एक परिधीय आयत की चौड़ाई। |
| ऊँचाई | float | एक परिधीय आयत की ऊँचाई। |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


एक बहुभुज को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | float[] | बिंदुओं के X निर्देशांक। |
| yPoints | float[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


एक बहुभुज को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xPoints | int[] | बिंदुओं के X निर्देशांक। |
| yPoints | int[] | बिंदुओं का Y निर्देशांक। |
| nPoints | int | बिंदुओं की संख्या. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


एक आयत को भरता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | आयत के ऊपरी बाएँ कोने का X निर्देशांक। |
| y | float | आयत के ऊपरी बाएँ कोने का Y निर्देशांक। |
| चौड़ाई | float | आयत की चौड़ाई। |
| ऊँचाई | float | आयत की ऊँचाई। |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


एक गोल आयत बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | float | आयत के ऊपरी बाएँ कोने का X निर्देशांक। |
| y | float | आयत के ऊपरी बाएँ कोने का Y निर्देशांक। |
| चौड़ाई | float | आयत की चौड़ाई। |
| ऊँचाई | float | आयत की ऊँचाई। |
| arcWidth | float | आर्क के वह घेराव आयत की चौड़ाई जो आयत के कोण को गोल करता है। |
| arcHeight | float | आर्क के वह घेराव आयत की ऊँचाई जो आयत के कोण को गोल करता है। |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


पृष्ठ की वर्तमान पृष्ठभूमि प्राप्त करता है।

**Returns:**
java.awt.Color - पृष्ठ की वर्तमान पृष्ठभूमि
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


वर्तमान अक्षरों का रूपांतरण प्राप्त करता है।

**Returns:**
java.awt.geom.AffineTransform - वर्तमान अक्षरों का ट्रांसफ़ॉर्म।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


परिणामी डिवाइस आउटपुट के निर्माता को प्राप्त करता है।

**Returns:**
java.lang.String - एक निर्माता मान।
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


वर्तमान पृष्ठ संख्या प्राप्त करता है।

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


वर्तमान फ़ॉन्ट प्राप्त करता है।

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


वर्तमान अपारदर्शिता प्राप्त करता है।

**Returns:**
float - वर्तमान अपारदर्शिता।
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


वर्तमान अपारदर्शिता मास्क प्राप्त करता है।

**Returns:**
java.awt.Paint - वर्तमान अपारदर्शिता मास्क।
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


वर्तमान पेंट प्राप्त करता है।

**Returns:**
java.awt.Paint - वर्तमान पेंट।
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


मेटाडेटा सहित डिवाइस गुण प्राप्त करता है।

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


स्ट्रिंग गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.lang.String - प्रॉपर्टी मान।
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


रंग गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Color - प्रॉपर्टी मान।
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


डबल गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
double - प्रॉपर्टी मान।
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


इंटीजर गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
int - प्रॉपर्टी मान।
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


मार्जिन गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Insets - प्रॉपर्टी मान।
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


मैट्रिक्स गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.geom.AffineTransform - प्रॉपर्टी मान।
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


आयत गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Rectangle - प्रॉपर्टी मान।
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


आकार गुण का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
java.awt.Dimension - प्रॉपर्टी मान।
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


सेव विकल्प लौटाता है।

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


पृष्ठ का आकार प्राप्त करता है।

**Returns:**
java.awt.Dimension - पृष्ठ का आकार।
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


वर्तमान स्ट्रोक प्राप्त करता है।

**Returns:**
java.awt.Stroke - वर्तमान स्ट्रोक।
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


वर्तमान टेक्स्ट रेंडरिंग मोड प्राप्त करता है।

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


वर्तमान टेक्स्ट स्ट्रोक की चौड़ाई प्राप्त करता है।

**Returns:**
float - वर्तमान टेक्स्ट स्ट्रोक की चौड़ाई।
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


वर्तमान ट्रांसफ़ॉर्म प्राप्त करता है।

**Returns:**
java.awt.geom.AffineTransform - वर्तमान ट्रांसफ़ॉर्म।
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


डिवाइस का क्लिप प्रारंभ करता है।

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


रेंडर करने के लिए पृष्ठों की संख्या को प्रारंभ करता है।

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


यह दर्शाता है कि डिवाइस सीधे RGB मोड का उपयोग करता है, अर्थात RGB।

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


बूलियन प्रॉपर्टी का मान प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | java.lang.String | प्रॉपर्टी का नाम। |

**Returns:**
boolean - प्रॉपर्टी मान।
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
public boolean openPage(float width, float height)
```


पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float |  |
| ऊँचाई | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| शीर्षक | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


पूरे दस्तावेज़ के लिए डिवाइस को प्रारंभिक स्थिति में रीसेट करें। आउटपुट स्ट्रीम को रीसेट करने के लिए उपयोग किया जाता है।

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मुख्यदस्तावेज़ | boolean |  |

### reset() {#reset--}
```
public void reset()
```


पृष्ठ के लिए डिवाइस को प्रारंभिक स्थिति में रीसेट करें।

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| शून्यपृष्ठसंख्या | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को घुमाएँ। writeTransform(Transform) को कॉल करता है। सकारात्मक कोण थिटा के साथ घुमाने से बिंदु सकारात्मक x अक्ष से सकारात्मक y अक्ष की ओर घुमते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| थिटा | double | घुमाने के लिए रेडियन में कोण। |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को किसी बिंदु के चारों ओर घुमाएँ।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| थिटा | double | रेडियन में घूर्णन का कोण। |
| x | double | बिंदु का X निर्देशांक। |
| y | double | बिंदु का Y निर्देशांक। |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को स्केल करता है। कॉल करता है writeTransform(Transform).

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | double | X अक्ष में एक स्केल। |
| y | double | Y अक्ष में एक स्केल। |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


पृष्ठ की वर्तमान पृष्ठभूमि निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पृष्ठभूमि | java.awt.Color | पृष्ठ की पृष्ठभूमि। |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


अक्षरों का ट्रांसफ़ॉर्म निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421अक्षरों का रूपांतरण। |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


डिवाइस का क्लिप निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| clipPath | java.awt.Shape | एक क्लिपिंग पाथ। |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


परिणामी डिवाइस आउटपुट के निर्माता को निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| निर्माता | java.lang.String | एक निर्माता मान। |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


फ़ॉन्ट निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | एक फ़ॉन्ट। |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


अपारदर्शिता निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अपारदर्शिता | float | एक अपारदर्शिता। |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


एक अपारदर्शिता मास्क निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| opacityMask | java.awt.Paint | एक अपारदर्शिता मास्क। |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


पेंट निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| paint | java.awt.Paint | एक पेंट। |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


मेटाडेटा सहित डिवाइस प्रॉपर्टीज़ निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | डिवाइस गुण। |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


रेंडरिंग प्रक्रिया को प्रबंधित करने के विकल्प निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | रेंडरिंग प्रक्रिया को प्रबंधित करने के विकल्प। |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


पृष्ठ का आकार निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


स्ट्रोक निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stroke | java.awt.Stroke | एक स्ट्रोक। |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


टेक्स्ट रेंडरिंग मोड निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | टेक्स्ट रेंडरिंग मोड। |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


टेक्स्ट स्ट्रोक की चौड़ाई निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| textStrokeWidth | float | टेक्स्ट स्ट्रोक चौड़ाई। |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


वर्तमान ट्रांसफ़ॉर्म निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | एक रूपांतरण.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को शीयर करता है। writeTransform(Transform) को कॉल करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| shx | double | X अक्ष में एक शीयर। |
| shy | double | Y अक्ष में एक शीयर। |

### startDocument() {#startDocument--}
```
public void startDocument()
```


दस्तावेज़ को रेंडर करना शुरू करने से पहले डिवाइस की आवश्यक तैयारी करता है।

### toString() {#toString--}
```
public String toString()
```


डिवाइस प्रकार का नाम लौटाता है।

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसफ़ॉर्म करता है। writeTransform(Transform) को कॉल करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | लागू करने के लिए रूपांतरण। |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसलेट करता है। writeTransform(Transform) को कॉल करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | double | X अक्ष में अनुवाद। |
| y | double | Y अक्ष में अनुवाद। |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


अन्य मल्टी-पेज डिवाइस से पृष्ठ पैरामीटर अपडेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


एक टिप्पणी लिखता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| टिप्पणी | java.lang.String | लिखने के लिए एक टिप्पणी। |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


निर्दिष्ट फ़ॉन्ट के साथ स्ट्रिंग लिखता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | निर्दिष्ट फ़ॉन्ट। |
| str | java.lang.String | स्ट्रिंग। |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चेतावनी | java.lang.String |  |

