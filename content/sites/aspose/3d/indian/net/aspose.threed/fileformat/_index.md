---
title: FileFormat
second_title: .NET API संदर्भ के लिए Aspose.3D
description: फ़इल स्वरूप परभष
type: docs
weight: 1000
url: /hi/net/aspose.threed/fileformat/
---
## FileFormat class

फ़ाइल स्वरूप परिभाषा

```csharp
public class FileFormat
```

## गुण

| नाम | विवरण |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | हो जाता है कि क्या Aspose.3D दृश्य को वर्तमान फ़ाइल स्वरूप में निर्यात करने का समर्थन करता है. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | हो जाता है कि Aspose.3D वर्तमान फ़ाइल स्वरूप से आयात दृश्य का समर्थन करता है या नहीं। |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | फ़ाइल स्वरूप सामग्री प्रकार प्राप्त करता है |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | इस प्रकार का एक्सटेंशन नाम प्राप्त करता है। |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | इस प्रकार के एक्सटेंशन नाम प्राप्त करता है। |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | फ़ाइल स्वरूप प्रकार प्राप्त करता है |
| [Version](../../aspose.threed/fileformat/version/) { get; } | फ़ाइल स्वरूप संस्करण प्राप्त करता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | फ़ाइल नाम से फ़ाइल प्रारूप का पता लगाएं, फ़ाइल पठनीय होनी चाहिए ताकि Aspose.3D फ़ाइल हेडर के माध्यम से फ़ाइल प्रारूप का पता लगा सके। |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | डेटा स्ट्रीम से फ़ाइल प्रारूप का पता लगाएं, फ़ाइल का नाम अनुमान लगाने के लिए वैकल्पिक है जिसमें कोई मैजिक हेडर नहीं है। |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | फ़ाइल एक्सटेंशन नाम से पसंदीदा फ़ाइल स्वरूप प्राप्त करता है एक्सटेंशन का नाम डॉट ('।') से शुरू होना चाहिए। |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | इस फ़ाइल प्रारूप के लिए एक डिफ़ॉल्ट लोड विकल्प बनाएं |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | इस फ़ाइल प्रारूप के लिए डिफ़ॉल्ट सहेजें विकल्प बनाएं |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | स्ट्रिंग के लिए प्रारूप |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | योगात्मक निर्माण फ़ाइल स्वरूप |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | 3डी स्टूडियो मैक्स का एएससीआईआई दृश्य निर्यातक प्रारूप। |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D वेब प्रारूप. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | कोलाडा फ़ाइल स्वरूप |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | 3D स्टूडियो का फ़ाइल प्रारूप |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | ऑटोकैड डीएक्सएफ |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | ASCII FBX फ़ाइल स्वरूप, 6.1.0 संस्करण के साथ |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | बाइनरी FBX फ़ाइल स्वरूप, 6.1.0 संस्करण के साथ |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.2.0 संस्करण के साथ |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.2.0 संस्करण के साथ |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.3.0 संस्करण के साथ |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.3.0 संस्करण के साथ |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.4.0 संस्करण के साथ |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.4.0 संस्करण के साथ |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.5.0 संस्करण के साथ |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.5.0 संस्करण के साथ |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.6.0 संस्करण के साथ |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.6.0 संस्करण के साथ |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | ASCII FBX फ़ाइल स्वरूप, 7.7.0 संस्करण के साथ |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | बाइनरी FBX फ़ाइल स्वरूप, 7.7.0 संस्करण के साथ |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | ख्रोनोस ग्रुप का glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | ख्रोनोस ग्रुप का जीएलटीएफ संस्करण 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | ख्रोनोस ग्रुप का जीएलटीएफ संस्करण 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | ख्रोनोस समूह का जीएलटीएफ बाइनरी प्रारूप में |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | HTML5 फ़ाइल |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | ASCII प्रारूप में Autodesk माया |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | बाइनरी फॉर्मेट में ऑटोडेस्क माया |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | माइक्रोसॉफ्ट 3डी निर्माण प्रारूप |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | ASCII मोड में पीसीएल पॉइंट क्लाउड डेटा फ़ाइल |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | बाइनरी मोड में पीसीएल पॉइंट क्लाउड डेटा फ़ाइल |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | सीमेंस जेटी फ़ाइल संस्करण 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | सीमेंस जेटी फ़ाइल संस्करण 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | एएससीआईआई एसटीएल फ़ाइल स्वरूप |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | बाइनरी एसटीएल फ़ाइल स्वरूप |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Universal3D फ़ाइल स्वरूप |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | सार्वभौमिक दृश्य विवरण |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | संकुचित सार्वभौमिक दृश्य विवरण |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | आभासी वास्तविकता मॉडलिंग भाषा |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | वेवफ्रंट की ओब्ज फ़ाइल प्रारूप |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | डायरेक्टएक्स एक्स फाइल बाइनरी फॉर्मेट में |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | डायरेक्टएक्स एक्स फाइल बाइनरी फॉर्मेट में |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Xyz पॉइंट क्लाउड फ़ाइल |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | ज़िप संग्रह जिसमें अन्य 3डी फ़ाइल प्रारूप शामिल है। |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | गूगल ड्रेको मेश |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | एडोब का पोर्टेबल दस्तावेज़ प्रारूप |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | बहुभुज फ़ाइल प्रारूप या स्टैनफोर्ड त्रिभुज प्रारूप |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | AVEVA प्लांट डिज़ाइन प्रबंधन प्रणाली मॉडल बाइनरी प्रारूप में |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | AVEVA संयंत्र डिजाइन प्रबंधन प्रणाली मॉडल पाठ प्रारूप में |

### यह सभी देखें

* नाम स्थान [Aspose.ThreeD](../../aspose.threed/)
* सभा [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
