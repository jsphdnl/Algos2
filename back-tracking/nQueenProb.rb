def mod(p,q)
  val = p-q
  return val > 0 ? val : -val   
end

def check(i, j, qA, curr, n)
  for k in 0 ... curr
    if (((i == k) || (j == qA[k]) || (mod(i,k) == mod(j,qA[k]))) && !qA.empty?)
     return false
    end 
  end
  return true
end

def solQ(i, j, qA, curr, n)
   if(curr == n)
    return true
   end
   j =0 
   while(j != n)
     if(check(i,j,qA,curr,n))
       qA[i] = j
       if(solQ(i+1, j, qA, curr+1,n))
         return true
       end
     end
     j = j + 1
   end
  return false
end

n = gets.chomp.to_i
qA = Array.new(n, nil)

def printSol(qA, n)
 for x in 0 ...n
   for y in 0 ... n
     if qA[y] == x
       print "1 "
     elsif
       print "0 " 
     end
   end
   print "\n"
 end
end

val = solQ(0,0,qA,0,n)
if(val && qA.length == n)
  print "solution found \n"
  printSol(qA, n)
elsif
  print "solution not found \n"
end
