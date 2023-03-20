package programs;

public class XpathConcepts {

/*

    There are several distinct, key XPath concepts in play here...

    Absolute vs relative XPaths (/ vs .)

/ introduces an absolute location path, starting at the root of the document.
. introduces a relative location path, starting at the context node.
    Named element vs any element (ename vs *)

/ename selects an ename root element
./ename selects all ename child elements of the context node.
*/
/* selects the root element, regardless of name.
./* or * selects all child elements of the context node, regardless of name.
descendant-or-self axis (//*)

//ename selects all ename elements in a document.
.//ename selects all ename elements at or beneath the context node.
//* selects all elements in a document, regardless of name.
.//* selects all elements, regardless of name, at or beneath the context node.

}
*/

//
}
