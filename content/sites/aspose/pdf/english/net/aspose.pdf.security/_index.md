---
title: Aspose.Pdf.Security
second_title: Aspose.PDF for .NET API Reference
description: The Aspose.Pdf.Security namespace contains classes used for encryption and digital signing
type: docs
weight: 210
url: /net/aspose.pdf.security/
---
The **Aspose.Pdf.Security** namespace contains classes used for encryption and digital signing.

## Classes

| Class | Description |
| --- | --- |
| [CertificateEncryptionOptions](./certificateencryptionoptions/) | Represents a class for encrypting options a PDF document using a certificate-based encryption method. Used to open encrypted PDF documents. |
| [DsaAlgorithmInfo](./dsaalgorithminfo/) | Represents a class for the information about the DSA signature algorithm. |
| [EcdsaAlgorithmInfo](./ecdsaalgorithminfo/) | Represents a class for the information about the ECDSA signature algorithm. |
| [EncryptionParameters](./encryptionparameters/) | Represents an encryption parameters class. |
| [KeyedSignatureAlgorithmInfo](./keyedsignaturealgorithminfo/) | Represents a class for information about a keyed signature algorithm. |
| [RsaAlgorithmInfo](./rsaalgorithminfo/) | Represents a class for the information about the RSA signature algorithm. |
| [SignatureAlgorithmInfo](./signaturealgorithminfo/) | Represents a class for information about a signature algorithm, including its type, cryptographic standard, and digest hash algorithm. |
| [SignatureLengthMismatchException](./signaturelengthmismatchexception/) | Represents errors that occur during PDF signing. Occurs if [`SignHash`](../aspose.pdf.forms/signhash/) is used to sign a document and the actual length of the signature is greater than that specified in the [`DefaultSignatureLength`](../aspose.pdf.forms/signature/defaultsignaturelength/) option. |
| [TimestampAlgorithmInfo](./timestampalgorithminfo/) | Represents a class for the information about the timestamp signature algorithm. |
| [UnknownSignatureAlgorithmInfo](./unknownsignaturealgorithminfo/) | Represents a class for the unknown signature algorithm information. |
| [ValidationOptions](./validationoptions/) | Represents options for validating a digital signature in a PDF document. |
| [ValidationResult](./validationresult/) | Represents the result of a validation process for a certificate. |
## Interfaces

| Interface | Description |
| --- | --- |
| [ICustomSecurityHandler](./icustomsecurityhandler/) | The custom security handler interface. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [CryptographicStandard](./cryptographicstandard/) | Represents the available cryptographic standards for securing PDF documents. |
| [SignatureAlgorithmType](./signaturealgorithmtype/) | Enumerates the types of signature algorithms used for digital signatures. |
| [ValidationMethod](./validationmethod/) | Represents an enum defined the method used for certificate validation. |
| [ValidationMode](./validationmode/) | Specifies the validation mode for PDF signature validation processes. |
| [ValidationStatus](./validationstatus/) | Represents the validation status of a certificate validation. |


