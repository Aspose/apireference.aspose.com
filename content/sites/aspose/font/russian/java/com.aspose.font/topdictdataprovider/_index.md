---
title: "TopDictDataProvider"
second_title: "Справочник API Aspose.Font for Java"
description: "Объявляет функциональность для чтения/обновления структуры CFF Top DICT."
type: docs
weight: 77
url: /ru/java/com.aspose.font/topdictdataprovider/
---
**Inheritance:**
java.lang.Object
```
public abstract class TopDictDataProvider
```

Объявляет функциональность для чтения/обновления структуры CFF Top DICT.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseFontName()](#getBaseFontName--) |  |
| [getCidCount()](#getCidCount--) |  |
| [getCidFontRevision()](#getCidFontRevision--) |  |
| [getCidFontType()](#getCidFontType--) |  |
| [getCidFontVersion()](#getCidFontVersion--) |  |
| [getClass()](#getClass--) |  |
| [getCopyright()](#getCopyright--) |  |
| [getFamilyName()](#getFamilyName--) |  |
| [getFontBBox()](#getFontBBox--) |  |
| [getFontMatrix()](#getFontMatrix--) |  |
| [getFontName()](#getFontName--) |  |
| [getFullName()](#getFullName--) |  |
| [getItalicAngle()](#getItalicAngle--) |  |
| [getNotice()](#getNotice--) |  |
| [getPaintType()](#getPaintType--) |  |
| [getPostScript()](#getPostScript--) |  |
| [getPrivateDictProvider()](#getPrivateDictProvider--) |  |
| [getRos(int[] registrySid, int[] orderingSid, int[] supplement)](#getRos-int---int---int---) |  |
| [getRos(String[] registry, String[] ordering, int[] supplement)](#getRos-java.lang.String---java.lang.String---int---) |  |
| [getStrokeWidth()](#getStrokeWidth--) |  |
| [getSyntheticBase()](#getSyntheticBase--) |  |
| [getUidBase()](#getUidBase--) |  |
| [getUnderlinePosition()](#getUnderlinePosition--) |  |
| [getUnderlineThickness()](#getUnderlineThickness--) |  |
| [getUniqueId()](#getUniqueId--) |  |
| [getVersion()](#getVersion--) |  |
| [getWeight()](#getWeight--) |  |
| [getXuid()](#getXuid--) |  |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBaseFontName(String value)](#setBaseFontName-java.lang.String-) |  |
| [setBaseFontNameSid(int sid)](#setBaseFontNameSid-int-) |  |
| [setCidCount(int value)](#setCidCount-int-) |  |
| [setCidFontRevision(int value)](#setCidFontRevision-int-) |  |
| [setCidFontType(int value)](#setCidFontType-int-) |  |
| [setCidFontVersion(int value)](#setCidFontVersion-int-) |  |
| [setCopyright(String value)](#setCopyright-java.lang.String-) |  |
| [setCopyrightSid(int sid)](#setCopyrightSid-int-) |  |
| [setFamilyName(String value)](#setFamilyName-java.lang.String-) |  |
| [setFamilyNameSid(int sid)](#setFamilyNameSid-int-) |  |
| [setFixedPitch(boolean value)](#setFixedPitch-boolean-) |  |
| [setFontBBox(FontBBox value)](#setFontBBox-com.aspose.font.FontBBox-) |  |
| [setFontMatrix(TransformationMatrix value)](#setFontMatrix-com.aspose.font.TransformationMatrix-) |  |
| [setFontName(String value)](#setFontName-java.lang.String-) |  |
| [setFontNameSid(int sid)](#setFontNameSid-int-) |  |
| [setFullName(String value)](#setFullName-java.lang.String-) |  |
| [setFullNameSid(int sid)](#setFullNameSid-int-) |  |
| [setItalicAngle(int value)](#setItalicAngle-int-) |  |
| [setNotice(String value)](#setNotice-java.lang.String-) |  |
| [setNoticeSid(int sid)](#setNoticeSid-int-) |  |
| [setPaintType(int value)](#setPaintType-int-) |  |
| [setPostScript(String value)](#setPostScript-java.lang.String-) |  |
| [setPostScriptSid(int sid)](#setPostScriptSid-int-) |  |
| [setRos(int registry, int ordering, int supplement)](#setRos-int-int-int-) |  |
| [setRos(String registry, String ordering, int supplement)](#setRos-java.lang.String-java.lang.String-int-) |  |
| [setStrokeWidth(int value)](#setStrokeWidth-int-) |  |
| [setSyntheticBase(int value)](#setSyntheticBase-int-) |  |
| [setUidBase(int value)](#setUidBase-int-) |  |
| [setUnderlinePosition(int value)](#setUnderlinePosition-int-) |  |
| [setUnderlineThickness(int value)](#setUnderlineThickness-int-) |  |
| [setUniqueId(int value)](#setUniqueId-int-) |  |
| [setVersion(String value)](#setVersion-java.lang.String-) |  |
| [setVersionSid(int sid)](#setVersionSid-int-) |  |
| [setWeight(String value)](#setWeight-java.lang.String-) |  |
| [setWeightSid(int sid)](#setWeightSid-int-) |  |
| [setXuid(double[] value)](#setXuid-double---) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseFontName() {#getBaseFontName--}
```
public String getBaseFontName()
```




**Returns:**
java.lang.String
### getCidCount() {#getCidCount--}
```
public int getCidCount()
```




**Returns:**
int
### getCidFontRevision() {#getCidFontRevision--}
```
public int getCidFontRevision()
```




**Returns:**
int
### getCidFontType() {#getCidFontType--}
```
public int getCidFontType()
```




**Returns:**
int
### getCidFontVersion() {#getCidFontVersion--}
```
public int getCidFontVersion()
```




**Returns:**
int
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCopyright() {#getCopyright--}
```
public String getCopyright()
```




**Returns:**
java.lang.String
### getFamilyName() {#getFamilyName--}
```
public String getFamilyName()
```




**Returns:**
java.lang.String
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```




**Returns:**
[FontBBox](../../com.aspose.font/fontbbox)
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```




**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix)
### getFontName() {#getFontName--}
```
public String getFontName()
```




**Returns:**
java.lang.String
### getFullName() {#getFullName--}
```
public String getFullName()
```




**Returns:**
java.lang.String
### getItalicAngle() {#getItalicAngle--}
```
public int getItalicAngle()
```




**Returns:**
int
### getNotice() {#getNotice--}
```
public String getNotice()
```




**Returns:**
java.lang.String
### getPaintType() {#getPaintType--}
```
public int getPaintType()
```




**Returns:**
int
### getPostScript() {#getPostScript--}
```
public String getPostScript()
```




**Returns:**
java.lang.String
### getPrivateDictProvider() {#getPrivateDictProvider--}
```
public PrivateDictDataProvider getPrivateDictProvider()
```




**Returns:**
com.aspose.font.PrivateDictDataProvider
### getRos(int[] registrySid, int[] orderingSid, int[] supplement) {#getRos-int---int---int---}
```
public void getRos(int[] registrySid, int[] orderingSid, int[] supplement)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| registrySid | int[] |  |
| orderingSid | int[] |  |
| дополнение | int[] |  |

### getRos(String[] registry, String[] ordering, int[] supplement) {#getRos-java.lang.String---java.lang.String---int---}
```
public void getRos(String[] registry, String[] ordering, int[] supplement)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| реестр | java.lang.String[] |  |
| упорядочивание | java.lang.String[] |  |
| дополнение | int[] |  |

### getStrokeWidth() {#getStrokeWidth--}
```
public int getStrokeWidth()
```




**Returns:**
int
### getSyntheticBase() {#getSyntheticBase--}
```
public int getSyntheticBase()
```




**Returns:**
int
### getUidBase() {#getUidBase--}
```
public int getUidBase()
```




**Returns:**
int
### getUnderlinePosition() {#getUnderlinePosition--}
```
public int getUnderlinePosition()
```




**Returns:**
int
### getUnderlineThickness() {#getUnderlineThickness--}
```
public int getUnderlineThickness()
```




**Returns:**
int
### getUniqueId() {#getUniqueId--}
```
public int getUniqueId()
```




**Returns:**
int
### getVersion() {#getVersion--}
```
public String getVersion()
```




**Returns:**
java.lang.String
### getWeight() {#getWeight--}
```
public String getWeight()
```




**Returns:**
java.lang.String
### getXuid() {#getXuid--}
```
public double[] getXuid()
```




**Returns:**
double[]
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```




**Returns:**
boolean
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setBaseFontName(String value) {#setBaseFontName-java.lang.String-}
```
public int setBaseFontName(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setBaseFontNameSid(int sid) {#setBaseFontNameSid-int-}
```
public void setBaseFontNameSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setCidCount(int value) {#setCidCount-int-}
```
public void setCidCount(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setCidFontRevision(int value) {#setCidFontRevision-int-}
```
public void setCidFontRevision(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setCidFontType(int value) {#setCidFontType-int-}
```
public void setCidFontType(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setCidFontVersion(int value) {#setCidFontVersion-int-}
```
public void setCidFontVersion(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setCopyright(String value) {#setCopyright-java.lang.String-}
```
public int setCopyright(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setCopyrightSid(int sid) {#setCopyrightSid-int-}
```
public void setCopyrightSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setFamilyName(String value) {#setFamilyName-java.lang.String-}
```
public int setFamilyName(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setFamilyNameSid(int sid) {#setFamilyNameSid-int-}
```
public void setFamilyNameSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setFixedPitch(boolean value) {#setFixedPitch-boolean-}
```
public void setFixedPitch(boolean value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean |  |

### setFontBBox(FontBBox value) {#setFontBBox-com.aspose.font.FontBBox-}
```
public void setFontBBox(FontBBox value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [FontBBox](../../com.aspose.font/fontbbox) |  |

### setFontMatrix(TransformationMatrix value) {#setFontMatrix-com.aspose.font.TransformationMatrix-}
```
public void setFontMatrix(TransformationMatrix value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [TransformationMatrix](../../com.aspose.font/transformationmatrix) |  |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public int setFontName(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setFontNameSid(int sid) {#setFontNameSid-int-}
```
public void setFontNameSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setFullName(String value) {#setFullName-java.lang.String-}
```
public int setFullName(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setFullNameSid(int sid) {#setFullNameSid-int-}
```
public void setFullNameSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setItalicAngle(int value) {#setItalicAngle-int-}
```
public void setItalicAngle(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setNotice(String value) {#setNotice-java.lang.String-}
```
public int setNotice(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setNoticeSid(int sid) {#setNoticeSid-int-}
```
public void setNoticeSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setPaintType(int value) {#setPaintType-int-}
```
public void setPaintType(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setPostScript(String value) {#setPostScript-java.lang.String-}
```
public int setPostScript(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setPostScriptSid(int sid) {#setPostScriptSid-int-}
```
public void setPostScriptSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setRos(int registry, int ordering, int supplement) {#setRos-int-int-int-}
```
public void setRos(int registry, int ordering, int supplement)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| реестр | int |  |
| упорядочивание | int |  |
| дополнение | int |  |

### setRos(String registry, String ordering, int supplement) {#setRos-java.lang.String-java.lang.String-int-}
```
public void setRos(String registry, String ordering, int supplement)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| реестр | java.lang.String |  |
| упорядочивание | java.lang.String |  |
| дополнение | int |  |

### setStrokeWidth(int value) {#setStrokeWidth-int-}
```
public void setStrokeWidth(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setSyntheticBase(int value) {#setSyntheticBase-int-}
```
public void setSyntheticBase(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setUidBase(int value) {#setUidBase-int-}
```
public void setUidBase(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setUnderlinePosition(int value) {#setUnderlinePosition-int-}
```
public void setUnderlinePosition(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setUnderlineThickness(int value) {#setUnderlineThickness-int-}
```
public void setUnderlineThickness(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setUniqueId(int value) {#setUniqueId-int-}
```
public void setUniqueId(int value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int |  |

### setVersion(String value) {#setVersion-java.lang.String-}
```
public int setVersion(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setVersionSid(int sid) {#setVersionSid-int-}
```
public void setVersionSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setWeight(String value) {#setWeight-java.lang.String-}
```
public int setWeight(String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String |  |

**Returns:**
int
### setWeightSid(int sid) {#setWeightSid-int-}
```
public void setWeightSid(int sid)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int |  |

### setXuid(double[] value) {#setXuid-double---}
```
public void setXuid(double[] value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double[] |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

