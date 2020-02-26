/*export const reverseString = (reverseMe) => {
    var reversed = reverseMe.split("").reverse().join("");
    return reversed;
};
*/
//recursive
export const reverseString = (reverseMe) => {
  if (reverseMe === "")
    return "";
  else
    return reverseString(reverseMe.substr(1)) + reverseMe.charAt(0);
};