---
title: "System::Xml::XmlConvert class"
linktitle: "XmlConvert"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlConvert class. Κωδικοποιεί και αποκωδικοποιεί ονόματα XML, και παρέχει μεθόδους για μετατροπή μεταξύ τύπων χρόνου εκτέλεσης και τύπων γλώσσας ορισμού XML Schema (XSD). Όταν μετατρέπονται τύποι δεδομένων, οι τιμές που επιστρέφονται είναι ανεξάρτητες από την τοπική ρύθμιση σε C++."
type: docs
weight: 1200
url: /el/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Κωδικοποιεί και αποκωδικοποιεί ονόματα XML, και παρέχει μεθόδους για μετατροπή μεταξύ τύπων χρόνου εκτέλεσης και τύπων XML [Schema](../../system.xml.schema/) γλώσσας ορισμού (XSD). Όταν μετατρέπονται τύποι δεδομένων, οι επιστρεφόμενες τιμές είναι ανεξάρτητες από την τοπική ρύθμιση.

```cpp
class XmlConvert : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Αποκωδικοποιεί ένα όνομα. Αυτή η μέθοδος κάνει το αντίστροφο των μεθόδων XmlConvert::EncodeName(String) και XmlConvert::EncodeLocalName(String). |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Μετατρέπει το όνομα σε έγκυρο τοπικό όνομα XML. |
| static [EncodeName](./encodename/)(const String\&) | Μετατρέπει το όνομα σε έγκυρο όνομα XML. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Επαληθεύει ότι το όνομα είναι έγκυρο σύμφωνα με την προδιαγραφή XML. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Ελέγχει εάν ο χαρακτήρας που δόθηκε είναι έγκυρος τύπος χαρακτήρα χωρίς άνω-κάτω. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Επιστρέφει το αντικείμενο χαρακτήρα που δόθηκε εάν ο χαρακτήρας στο όρισμα είναι έγκυρος χαρακτήρας δημόσιου id, διαφορετικά **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Ελέγχει εάν ο χαρακτήρας που δόθηκε είναι έγκυρος τύπος χαρακτήρα εκκίνησης ονόματος. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Ελέγχει εάν ο δοσμένος χαρακτήρας είναι έγκυρος χαρακτήρας κενού XML. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Ελέγχει εάν ο δοσμένος χαρακτήρας είναι έγκυρος χαρακτήρας XML. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Ελέγχει εάν το δοσμένο ζεύγος αντιπροσώπων χαρακτήρων είναι έγκυρος χαρακτήρας XML. |
| static [ToBoolean](./toboolean/)(String) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Μετατρέπει το [String](../../system/string/) σε [DateTime](../../system/datetime/) χρησιμοποιώντας το καθορισμένο [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Μετατρέπει το παρεχόμενο [String](../../system/string/) σε ισοδύναμο [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Μετατρέπει το παρεχόμενο [String](../../system/string/) σε ισοδύναμο [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Μετατρέπει το παρεχόμενο [String](../../system/string/) σε ισοδύναμο [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | Μετατρέπει το [String](../../system/string/) σε ισοδύναμο [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | Μετατρέπει το [Boolean](../../system/boolean/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Μετατρέπει το [Char](../../system/char/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Μετατρέπει το [Decimal](../../system/decimal/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Μετατρέπει το [SByte](../../system/sbyte/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Μετατρέπει το [Int16](../../system/int16/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Μετατρέπει το [Int32](../../system/int32/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Μετατρέπει το [Int64](../../system/int64/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Μετατρέπει το [Byte](../../system/byte/) σε [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Μετατρέπει το [UInt16](../../system/uint16/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Μετατρέπει το [UInt32](../../system/uint32/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Μετατρέπει το [UInt64](../../system/uint64/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Μετατρέπει το [Single](../../system/single/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Μετατρέπει το [Double](../../system/double/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Μετατρέπει το [TimeSpan](../../system/timespan/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Μετατρέπει το [DateTime](../../system/datetime/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Μετατρέπει το [DateTime](../../system/datetime/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Μετατρέπει το [DateTime](../../system/datetime/) σε ένα [String](../../system/string/) χρησιμοποιώντας το καθορισμένο [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToString](./tostring/)(DateTimeOffset) | Μετατρέπει το παρεχόμενο [DateTimeOffset](../../system/datetimeoffset/) σε ένα [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Μετατρέπει το παρεχόμενο [DateTimeOffset](../../system/datetimeoffset/) σε ένα [String](../../system/string/) στην καθορισμένη μορφή. |
| static [ToString](./tostring/)(Guid) | Μετατρέπει το [Guid](../../system/guid/) σε ένα [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ένα ισοδύναμο [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ένα ισοδύναμο [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ένα ισοδύναμο [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | Μετατρέπει το [String](../../system/string/) σε ένα ισοδύναμο [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Επαληθεύει ότι το όνομα είναι έγκυρο σύμφωνα με τη σύσταση του W3C Extended Markup Language. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Επαληθεύει ότι το όνομα είναι έγκυρο **NCName** σύμφωνα με τη σύσταση του W3C Extended Markup Language. Ένα **NCName** είναι ένα όνομα που δεν μπορεί να περιέχει άνω τελεία. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Επαληθεύει ότι η συμβολοσειρά είναι έγκυρο NMTOKEN σύμφωνα με τη σύσταση του W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Επιστρέφει το περασμένο αντικείμενο συμβολοσειράς εάν όλοι οι χαρακτήρες στο όρισμα της συμβολοσειράς είναι έγκυροι χαρακτήρες δημόσιου αναγνωριστικού. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Επαληθεύει ότι η συμβολοσειρά είναι έγκυρο token σύμφωνα με τη σύσταση του W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Επιστρέφει το περασμένο αντικείμενο συμβολοσειράς εάν όλοι οι χαρακτήρες στο όρισμα της συμβολοσειράς είναι έγκυροι χαρακτήρες λευκού διαστήματος. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Επιστρέφει τη μεταβιβασμένη συμβολοσειρά εάν όλοι οι χαρακτήρες και οι χαρακτήρες ζεύγους υποκατάστασης στο όρισμα της συμβολοσειράς είναι έγκυροι χαρακτήρες XML· διαφορετικά, μια [XmlException](../xmlexception/) ρίχνεται με πληροφορίες για τον πρώτο μη έγκυρο χαρακτήρα που εντοπίστηκε. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
