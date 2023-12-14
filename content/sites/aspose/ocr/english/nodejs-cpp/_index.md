---
title: Aspose.OCR for Node.js via C++
weight: 12
url: /nodejs-cpp/
keywords: 
description: 
is_root: true
---

<a name="module_Module"></a>

## Module

* [Module](#module_Module)
    * [~WasmAsposeOCRRecognitionSettings](#module_Module..WasmAsposeOCRRecognitionSettings)
        * [new WasmAsposeOCRRecognitionSettings()](#new_module_Module..WasmAsposeOCRRecognitionSettings_new)
    * [~WasmAsposeOCRInput](#module_Module..WasmAsposeOCRInput)
        * [new WasmAsposeOCRInput()](#new_module_Module..WasmAsposeOCRInput_new)
    * [~Rect](#module_Module..Rect)
        * [new Rect()](#new_module_Module..Rect_new)
    * [~ExportFormat](#module_Module..ExportFormat) : <code>enum</code>
    * [~CharactersAllowedType](#module_Module..CharactersAllowedType) : <code>enum</code>
    * [~DetectAreasMode](#module_Module..DetectAreasMode) : <code>enum</code>
    * [~AsposeOCRRawDataType](#module_Module..AsposeOCRRawDataType) : <code>enum</code>
    * [~Language](#module_Module..Language) : <code>enum</code>
    * [~AsposeOCRSetLicense(licenseFullPath)](#module_Module..AsposeOCRSetLicense)
    * [~AsposeOCRGetState()](#module_Module..AsposeOCRGetState) ⇒ <code>boolean</code>
    * [~AsposeOCRRecognize(descriptors, settings)](#module_Module..AsposeOCRRecognize) ⇒ <code>WasmAsposeOCRRecognitionResult</code>
    * [~AsposeOCRSerializeResult(recognition_result, format)](#module_Module..AsposeOCRSerializeResult) ⇒ <code>string</code>
    * [~Rect](#module_Module..Rect) : <code>object</code>
        * [new Rect()](#new_module_Module..Rect_new)
    * [~VectorRect](#module_Module..VectorRect) : <code>Array.&lt;Rect&gt;</code>
    * [~WasmAsposeOCRInputs](#module_Module..WasmAsposeOCRInputs) : <code>Array.&lt;WasmAsposeOCRInput&gt;</code>
    * [~WasmAsposeOCRRecognitionSettings](#module_Module..WasmAsposeOCRRecognitionSettings) : <code>object</code>
        * [new WasmAsposeOCRRecognitionSettings()](#new_module_Module..WasmAsposeOCRRecognitionSettings_new)
    * [~WasmAsposeOCRInput](#module_Module..WasmAsposeOCRInput) : <code>object</code>
        * [new WasmAsposeOCRInput()](#new_module_Module..WasmAsposeOCRInput_new)
    * [~WasmAsposeOCRRecognitionArea](#module_Module..WasmAsposeOCRRecognitionArea) : <code>object</code>
    * [~WasmAsposeOCRRecognizedPage](#module_Module..WasmAsposeOCRRecognizedPage) : <code>object</code>
    * [~WasmAsposeOCRRecognitionResult](#module_Module..WasmAsposeOCRRecognitionResult) : <code>object</code>

<a name="module_Module..WasmAsposeOCRRecognitionSettings"></a>

### Module~WasmAsposeOCRRecognitionSettings
**Kind**: inner class of [<code>Module</code>](#module_Module)  
<a name="new_module_Module..WasmAsposeOCRRecognitionSettings_new"></a>

#### new WasmAsposeOCRRecognitionSettings()
Empty constructor of WasmAsposeOCRRecognitionSettings.

<a name="module_Module..WasmAsposeOCRInput"></a>

### Module~WasmAsposeOCRInput
**Kind**: inner class of [<code>Module</code>](#module_Module)  
<a name="new_module_Module..WasmAsposeOCRInput_new"></a>

#### new WasmAsposeOCRInput()
Empty constructor of WasmAsposeOCRInput.

<a name="module_Module..Rect"></a>

### Module~Rect
**Kind**: inner class of [<code>Module</code>](#module_Module)  
<a name="new_module_Module..Rect_new"></a>

#### new Rect()
Empty constructor of Rect.

<a name="module_Module..ExportFormat"></a>

### Module~ExportFormat : <code>enum</code>
(ENUM) The format for recognition result.
text: 0
json: 1
xml: 2

**Kind**: inner enum of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Default |
| --- | --- | --- |
| text | <code>int</code> | <code>0</code> | 
| json | <code>int</code> | <code>1</code> | 
| xml | <code>int</code> | <code>2</code> | 

<a name="module_Module..CharactersAllowedType"></a>

### Module~CharactersAllowedType : <code>enum</code>
(ENUM) Determines the type of characters allowed for recognition result.
Used in the RecognitionSettings to indicate which characters will be recognized.
ALL: 0, LATIN_ALPHABET: 1, DIGITS: 2

**Kind**: inner enum of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Default |
| --- | --- | --- |
| ALL | <code>int</code> | <code>0</code> | 
| LATIN_ALPHABET | <code>int</code> | <code>1</code> | 
| DIGITS | <code>int</code> | <code>2</code> | 

<a name="module_Module..DetectAreasMode"></a>

### Module~DetectAreasMode : <code>enum</code>
(ENUM) Determines the type of neural network used for areas detection.
Used in the RecognitionSettings to specify which type of image you want to recognize.

**Kind**: inner enum of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Default | Description |
| --- | --- | --- | --- |
| NONE | <code>int</code> | <code>0</code> | Doesn't detect paragraphs. Better for a simple one-column document without pictures. |
| DOCUMENT | <code>int</code> | <code>1</code> | Detects paragraphs uses NN model for documents.  Better for multicolumn document, document with pictures or with other not text objects. |
| PHOTO | <code>int</code> | <code>2</code> | Detects paragraphs uses NN model for photos.  Better for image with a lot of pictures and other not text objects. |
| COMBINE | <code>int</code> | <code>3</code> | Detects   paragraphs with text and then uses other NN model to detect areas inside of paragraphs. Better for images with complex structure. |
| TABLE | <code>int</code> | <code>4</code> | Detects cells with text. Preferable mode for images with table structure.. |
| CURVED_TEXT | <code>int</code> | <code>5</code> | Detects lines and recognizes text on curved images. Preferred mode for photos of book and magazine pages. |

<a name="module_Module..AsposeOCRRawDataType"></a>

### Module~AsposeOCRRawDataType : <code>enum</code>
(ENUM) Data type for AsposeOCRInput

**Kind**: inner enum of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Default |
| --- | --- | --- |
| UNKNOWN | <code>int</code> | <code>0</code> | 
| GRAYSCALE | <code>int</code> | <code>1</code> | 
| RGB | <code>int</code> | <code>2</code> | 

<a name="module_Module..Language"></a>

### Module~Language : <code>enum</code>
Languages used for OCR.
ISO 639-2 Code

**Kind**: inner enum of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Default | Description |
| --- | --- | --- | --- |
| NONE | <code>int</code> | <code>0</code> | Multi-language support |
| ENG | <code>int</code> | <code>1</code> | English alphabet |
| DEU | <code>int</code> | <code>2</code> | German alphabet |
| POR | <code>int</code> | <code>3</code> | Portuguese alphabet |
| SPA | <code>int</code> | <code>4</code> | Spanish alphabet |
| FRA | <code>int</code> | <code>5</code> | French alphabet |
| ITA | <code>int</code> | <code>6</code> | Italian alphabet |
| CZE | <code>int</code> | <code>7</code> | Czech alphabet |
| DAN | <code>int</code> | <code>8</code> | Danish alphabet |
| DUM | <code>int</code> | <code>9</code> | Dutch alphabet |
| EST | <code>int</code> | <code>10</code> | Estonian alphabet |
| FIN | <code>int</code> | <code>11</code> | Finnish alphabet |
| LAV | <code>int</code> | <code>12</code> | Latvian alphabet |
| LIT | <code>int</code> | <code>13</code> | Lithuanian alphabet |
| NOR | <code>int</code> | <code>14</code> | Norwegian alphabet |
| POL | <code>int</code> | <code>15</code> | Polish alphabet |
| RUM | <code>int</code> | <code>16</code> | Romanian alphabet |
| SRP_HRV | <code>int</code> | <code>17</code> | Serbo-Croatian alphabet |
| SLK | <code>int</code> | <code>18</code> | Slovak alphabet |
| SLV | <code>int</code> | <code>19</code> | Slovene alphabet |
| SWE | <code>int</code> | <code>20</code> | Swedish alphabet |
| CHI | <code>int</code> | <code>21</code> | Chinese alphabet |
| BEL | <code>int</code> | <code>22</code> | Belorussian alphabet |
| BUL | <code>int</code> | <code>23</code> | Bulgarian alphabet |
| RUS | <code>int</code> | <code>24</code> | Russian alphabet |
| SRP | <code>int</code> | <code>25</code> | Serbian alphabet |
| UKR | <code>int</code> | <code>26</code> | Ukrainian alphabet |
| HIN | <code>int</code> | <code>28</code> | Hindi alphabet |

<a name="module_Module..AsposeOCRSetLicense"></a>

### Module~AsposeOCRSetLicense(licenseFullPath)
Set license to library. License is XML file.

**Kind**: inner method of [<code>Module</code>](#module_Module)  

| Param | Type | Description |
| --- | --- | --- |
| licenseFullPath | <code>string</code> | path to license file. |

<a name="module_Module..AsposeOCRGetState"></a>

### Module~AsposeOCRGetState() ⇒ <code>boolean</code>
Check license.

**Kind**: inner method of [<code>Module</code>](#module_Module)  
**Returns**: <code>boolean</code> - True if the license is installed and valid, otherwise false.  
<a name="module_Module..AsposeOCRRecognize"></a>

### Module~AsposeOCRRecognize(descriptors, settings) ⇒ <code>WasmAsposeOCRRecognitionResult</code>
Optical character recognition image with automatic detection of text areas
Allowed formats:
1) Images PNG, JPG, BMP, TIFF from file system
2) ZIP archive or images from folder in file system
Internal archives and folders are not supported
Only PNG, JPG, BMP, TIFF internal images are used
for recognition from ZIP archive or from folder
3) Images PNG, JPG, BMP from URI

**Kind**: inner method of [<code>Module</code>](#module_Module)  
**Returns**: <code>WasmAsposeOCRRecognitionResult</code> - - result of recognition as a complex structure AsposeOCRRecognitionResult, that described in definition.  

| Param | Type | Description |
| --- | --- | --- |
| descriptors | <code>WasmAsposeOCRInput</code> | image descriptors array. |
| settings | <code>WasmAsposeOCRRecognitionSettings</code> | Size of allocated descriptors. |

<a name="module_Module..AsposeOCRSerializeResult"></a>

### Module~AsposeOCRSerializeResult(recognition_result, format) ⇒ <code>string</code>
Prepare a recognition result in awailable output formats
Allowed formats: text, json, xml

**Kind**: inner method of [<code>Module</code>](#module_Module)  
**Returns**: <code>string</code> - A string filled with data of the specified format  

| Param | Type | Description |
| --- | --- | --- |
| recognition_result | <code>WasmAsposeOCRRecognitionResult</code> | recognitized result. |
| format | <code>ExportFormat</code> | output format descriptor. |

<a name="module_Module..Rect"></a>

### Module~Rect : <code>object</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Description |
| --- | --- | --- |
| x | <code>number</code> | left top corner coordinate. |
| y | <code>number</code> | left top corner coordinate. |
| width | <code>number</code> | width in pixels. |
| height | <code>number</code> | height in pixels. |

<a name="new_module_Module..Rect_new"></a>

#### new Rect()
Empty constructor of Rect.

<a name="module_Module..VectorRect"></a>

### Module~VectorRect : <code>Array.&lt;Rect&gt;</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
<a name="module_Module..WasmAsposeOCRInputs"></a>

### Module~WasmAsposeOCRInputs : <code>Array.&lt;WasmAsposeOCRInput&gt;</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
<a name="module_Module..WasmAsposeOCRRecognitionSettings"></a>

### Module~WasmAsposeOCRRecognitionSettings : <code>object</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Description |
| --- | --- | --- |
| all_image | <code>boolean</code> | Disabled (false) by default. Turning on means recognizing the image as a single area. |
| correct_skew | <code>boolean</code> | Enabled (true) by default. Detects orientation and auto-rotate image if needed. |
| upscale_small_font | <code>boolean</code> | Allows you to use additional algorithms specifically for small font recognition. Useful for images with small-size characters. |
| lines_filtration | <code>boolean</code> | Disabled (false) by default. Allows to recognize text in the tables (regions surrounded lines). |
| alphabet | <code>string</code> | Set of allowed characters in the alphabet (symbols for recognition). |
| ignoredCharacters | <code>string</code> | Sets blacklist for recognition symbols. |
| rectangles | <code>VectorRect</code> | Choose areas for recognition. |
| preprocess_area | <code>Rect</code> | User area to be pre-processed |
| skew | <code>number</code> | Rotate image on specified angle. Doesn't work if rectangles aDere specified. |
| language_alphabet | <code>Language</code> | Language used for OCR. Supported languages: English (en), German (de), Portuguese (pt), Spanish (es), French (fr), Italian (it), Czech (cze), Danish (dan), Dutch (dum), Estonian (est), Finnish (fin), Latvian (lav), Lithuanian (lit), Norwegian (nor), Polish (pol), Romanian (rum), Serbo-Croatian (srp_hrv), Slovak (slk), Slovene (slv), Swedish (swe), Chinese (chi) |
| threshold_value | <code>number</code> | Sets custom threshold value for image binarization. Range from 1 to 255. |
| allowed_characters | <code>CharactersAllowedType</code> | Allowed characters set. Determines the type of characters allowed for recognition result. |
| auto_contrast | <code>boolean</code> | Allows using an additional contrast correction algorithm for the image before recognition. |
| auto_denoising | <code>boolean</code> | Enables the use of an additional neural network for the image before recognition. Useful for images with noice, spots, flares, gradients, foreign elements. |
| detect_areas_mode | <code>DetectAreasMode</code> | Allows to select the optimal mode for document type areas: document, photo, plain text, column, image. |

<a name="new_module_Module..WasmAsposeOCRRecognitionSettings_new"></a>

#### new WasmAsposeOCRRecognitionSettings()
Empty constructor of WasmAsposeOCRRecognitionSettings.

<a name="module_Module..WasmAsposeOCRInput"></a>

### Module~WasmAsposeOCRInput : <code>object</code>
Descriptor, that can describe input raw data or path to fileIf field "file_path" not empty, takes precedence over the raw data part

**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Description |
| --- | --- | --- |
| raw_data | <code>VectorRect</code> | * Input raw data in special format Input raw data in special format may represent: row_index 0 ... height column_index 0 ... width  1) RGB color model (channels_size = 3): - raw_data[row_index * width * 3 + column_index * 3 + 0] = RED - raw_data[row_index * width * 3 + column_index * 3 + 1] = GREEN - raw_data[row_index * width * 3 + column_index * 3 + 2] = BLUE 2) Grayscale (channels_size = 1): - raw_data[row_index * width + column_index] = grayscale value |
| height | <code>number</code> | image height. |
| width | <code>number</code> | image width. |
| raw_data_type | <code>AsposeOCRRawDataType</code> | represent input raw_data format |
| url | <code>string</code> | Null terminated string, that describe file URL (file system path). |

<a name="new_module_Module..WasmAsposeOCRInput_new"></a>

#### new WasmAsposeOCRInput()
Empty constructor of WasmAsposeOCRInput.

<a name="module_Module..WasmAsposeOCRRecognitionArea"></a>

### Module~WasmAsposeOCRRecognitionArea : <code>object</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Description |
| --- | --- | --- |
| area | <code>Rect</code> | Area rectangle, that containe an recognized text in "recognized_text" field |
| recognized_text | <code>string</code> | Recognized text array field. |

<a name="module_Module..WasmAsposeOCRRecognizedPage"></a>

### Module~WasmAsposeOCRRecognizedPage : <code>object</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type | Description |
| --- | --- | --- |
| recognized_areas | <code>Array.&lt;WasmAsposeOCRRecognitionArea&gt;</code> | Array of recognized areas. |

<a name="module_Module..WasmAsposeOCRRecognitionResult"></a>

### Module~WasmAsposeOCRRecognitionResult : <code>object</code>
**Kind**: inner typedef of [<code>Module</code>](#module_Module)  
**Properties**

| Name | Type |
| --- | --- |
| recognized_pages | <code>Array.&lt;WasmAsposeOCRRecognizedPage&gt;</code> | 

