
def solveMaze(inp, x, y, m, n, sol)
 
  if(inp[m][n] != 1)
   return false
  end
 #Base condition
 if((x == m) && (y == n))
    sol[x][y] = 1
    return true
  end
  # boundaries back off
  if ((x > m) || (y > m))
    return false
  end
  if(inp[x][y] == 1)
     sol[x][y] = 1
    #move down
    if(solveMaze(inp, x+1, y, m, n, sol))
      return true
    end
    #move left
    if(solveMaze(inp, x, y+1, m, n, sol))
      return true
    end
    #back track
    sol[x][y] = 0
  else
    return false  
  end
  return false
end

n = gets.chomp.to_i
inp = Array.new(n)
sol = Array.new(n){Array.new(n,0)}
for x in 0...n
  inp[x] = gets.chomp.split(" ").map(&:to_i)
end

if(solveMaze(inp, 0, 0, n-1, n-1,sol))
  for x in 0...n 
   print "#{sol[x]}\n"
  end
else
 print "cannot solve maze\n"
end

